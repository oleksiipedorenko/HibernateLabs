package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.practice.hibernate.dao.UserDao;
import ua.skillsup.practice.hibernate.dao.entity.User;
import ua.skillsup.practice.hibernate.model.UserDto;

import java.util.ArrayList;
import java.util.List;

import static ua.skillsup.practice.hibernate.converters.EntityDtoConverter.convert;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public List<UserDto> findAll() {
		List<User> items =
				sessionFactory.getCurrentSession()
						.createQuery("from User").list();
		List<UserDto> result = new ArrayList<>(items.size());
		for (User item : items) {
			result.add(convert(item));
		}
		return result;
	}

	public UserDto findById(long id) {
		return null;
	}

	public UserDto findByLogin(String login) {
		User user = (User) sessionFactory.getCurrentSession()
				.createQuery("SELECT i FROM User i WHERE i.login = :login")
				.setParameter("login", login).uniqueResult();
		return user == null ? null : convert(user);
	}

	public long create(UserDto userDto) {
		return 0;
	}

	public void update(UserDto userDto) {

	}
}