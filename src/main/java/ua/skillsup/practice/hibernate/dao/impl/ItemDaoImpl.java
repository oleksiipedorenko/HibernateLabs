package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.skillsup.practice.hibernate.dao.ItemDao;
import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.filter.ItemFilter;

import java.util.List;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<ItemDto> findAll() {
		return null;
	}

	public ItemDto findById(long id) {
		return null;
	}

	public ItemDto findByTitle(String title) {
		return null;
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