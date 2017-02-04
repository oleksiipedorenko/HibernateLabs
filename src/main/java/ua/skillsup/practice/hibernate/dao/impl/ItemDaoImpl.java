package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.practice.hibernate.converters.EntityDtoConverter;
import ua.skillsup.practice.hibernate.dao.ItemDao;
import ua.skillsup.practice.hibernate.dao.entity.Item;
import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.filter.ItemFilter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public List<ItemDto> findAll() {
		List<Item> list = sessionFactory.getCurrentSession()
				.createQuery("from Item").list();
		return list.stream()
				.peek(item -> System.out.println(item.getCategories()))
				.map(EntityDtoConverter::convert)
				.collect(Collectors.toList());
	}

	public ItemDto findById(long id) {
		return null;
	}

	@Transactional(readOnly = true)
	public ItemDto findByTitle(String title) {
		List<Item> list = sessionFactory.getCurrentSession()
				.createQuery("select i from Item i where i.title = :title")
				.setString("title", title).list();

		return list.stream()
				.findAny()
				.map(EntityDtoConverter::convert)
				.orElse(null);
	}

	public List<ItemDto> findByFilter(ItemFilter filter) {
		return null;
	}

	public long create(ItemDto itemDto) {
		return 0;
	}

	public void update(ItemDto itemDto) {

	}
}