package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.practice.hibernate.dao.ItemDao;
import ua.skillsup.practice.hibernate.dao.entity.Item;
import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.filter.ItemFilter;

import java.util.ArrayList;
import java.util.List;

import static ua.skillsup.practice.hibernate.converters.EntityDtoConverter.convert;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
@Transactional(readOnly = true)
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<ItemDto> findAll() {
		List<Item> items = sessionFactory.getCurrentSession().createQuery("from Item").list();
		List<ItemDto> result = new ArrayList<ItemDto>(items.size());
		for (Item item : items) {
			result.add(convert(item));
			System.out.println(item.getCategories());
		}
		return result;
	}

	public ItemDto findById(long id) {
		return null;
	}

	public ItemDto findByTitle(String title) {
		List<Item> items = sessionFactory.getCurrentSession()
				.createQuery("select i from Item i where i.title = :title")
				.setParameter("title", title).list();
		if (items.isEmpty()) {
			return null;
		} else {
			return convert(items.get(0));
		}
	}

	public List<ItemDto> findByFilter(ItemFilter filter) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Item.class);
		if (filter.getHeightFrom() != null) {
			criteria.add(Restrictions.gt("height", filter.getHeightFrom()));
		}
		if (filter.getHeightTo() != null) {
			criteria.add(Restrictions.lt("height", filter.getHeightTo()));
		}
		if (filter.getWidthFrom() != null) {
			criteria.add(Restrictions.gt("width", filter.getWidthFrom()));
		}
		if (filter.getWidthTo() != null) {
			criteria.add(Restrictions.lt("width", filter.getWidthTo()));
		}
		if (filter.getWeightFrom() != null) {
			criteria.add(Restrictions.gt("weight", filter.getWeightFrom()));
		}
		if (filter.getWeightTo() != null) {
			criteria.add(Restrictions.lt("weight", filter.getWeightTo()));
		}
		List<Item> items = criteria.list();
		List<ItemDto> result = new ArrayList<ItemDto>(items.size());
		for (Item item : items) {
			result.add(convert(item));
		}
		return result;
	}

	public long create(ItemDto itemDto) {
		return 0;
	}

	public void update(ItemDto itemDto) {

	}
}