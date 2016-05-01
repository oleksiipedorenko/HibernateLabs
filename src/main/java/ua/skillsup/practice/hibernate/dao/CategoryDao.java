package ua.skillsup.practice.hibernate.dao;

import ua.skillsup.practice.hibernate.model.CategoryDto;
import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.filter.ItemFilter;

import java.util.List;

/**
 * Created by oleksii on 4/30/16.
 */
public interface CategoryDao {

	CategoryDto findByTitle(String title);
}
