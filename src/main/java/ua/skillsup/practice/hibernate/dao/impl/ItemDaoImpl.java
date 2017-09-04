package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.practice.hibernate.converters.EntityDtoConverter;
import ua.skillsup.practice.hibernate.dao.ItemDao;
import ua.skillsup.practice.hibernate.dao.entity.Item;
import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.filter.ItemFilter;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static java.util.stream.Collectors.toList;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
@Transactional(readOnly = true)
public class ItemDaoImpl implements ItemDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public ItemDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<ItemDto> findAll() {
		List<Item> items = sessionFactory.getCurrentSession()
				.createQuery("from Item")
				.list();
		return items.stream().map(EntityDtoConverter::convert).collect(toList());
	}

	public ItemDto findById(long id) {
		return null;
	}

	public ItemDto findByTitle(String title) {
		Item item = (Item) sessionFactory.getCurrentSession()
				.createQuery("SELECT i FROM Item i WHERE i.title = :title")
				.setParameter("title", title)
				.uniqueResult();

		return EntityDtoConverter.convert(item);
	}

	public List<ItemDto> findByFilter(ItemFilter filter) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Item.class);
		Optional.ofNullable(filter.getHeightFrom())
				.ifPresent(value ->
						criteria.add(Restrictions.ge("height", value)));
		Optional.ofNullable(filter.getHeightTo())
				.ifPresent(value ->
						criteria.add(Restrictions.le("height", value)));
		Optional.ofNullable(filter.getWeightFrom())
				.ifPresent(value ->
						criteria.add(Restrictions.ge("weight", value)));
		Optional.ofNullable(filter.getWeightTo())
				.ifPresent(value ->
						criteria.add(Restrictions.le("weight", value)));
		Optional.ofNullable(filter.getWidthFrom())
				.ifPresent(value ->
						criteria.add(Restrictions.ge("width", value)));
		Optional.ofNullable(filter.getWidthTo())
				.ifPresent(value ->
						criteria.add(Restrictions.le("width", value)));
		List<Item> items = criteria.list();
		return items.stream().map(EntityDtoConverter::convert).collect(toList());
	}

	public long create(ItemDto itemDto) {
		return 0;
	}

	public void update(ItemDto itemDto) {

	}

	@Override
	public List<ItemDto> findByCategories(Set<String> categories) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Item.class, "i");

		criteria.createAlias("i.categoryList", "c", JoinType.INNER_JOIN);
		criteria.add(Restrictions.in("c.title", categories));

		List<Item> items = criteria.list();

		return items.stream().map(EntityDtoConverter::convert).collect(toList());
	}
}