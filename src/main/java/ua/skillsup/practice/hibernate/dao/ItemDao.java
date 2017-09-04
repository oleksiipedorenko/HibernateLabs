package ua.skillsup.practice.hibernate.dao;

import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.filter.ItemFilter;

import java.util.List;
import java.util.Set;

/**
 * Created by oleksii on 10/10/15.
 */
public interface ItemDao {

	List<ItemDto> findAll();
	ItemDto findById(long id);
	ItemDto findByTitle(String title);
	List<ItemDto> findByFilter(ItemFilter filter);
	long create(ItemDto itemDto);
	void update(ItemDto itemDto);
	List<ItemDto> findByCategories(Set<String> categories);
}