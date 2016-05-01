package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.skillsup.practice.hibernate.dao.CategoryDao;
import ua.skillsup.practice.hibernate.dao.entity.Category;
import ua.skillsup.practice.hibernate.model.CategoryDto;

import static ua.skillsup.practice.hibernate.converters.EntityDtoConverter.convert;

/**
 * Created by oleksii on 4/30/16.
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public CategoryDto findByTitle(String title) {
		Category item = (Category) sessionFactory.getCurrentSession()
				.createQuery("SELECT i FROM Category i WHERE i.title = :title")
				.setParameter("title", title).uniqueResult();
		return item == null ? null : convert(item);
	}
}
