package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.skillsup.practice.hibernate.converters.EntityDtoConverter;
import ua.skillsup.practice.hibernate.dao.UserDao;
import ua.skillsup.practice.hibernate.dao.entity.Item;
import ua.skillsup.practice.hibernate.dao.entity.User;
import ua.skillsup.practice.hibernate.model.UserDto;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<UserDto> findAll() {
		List<User> list = sessionFactory.getCurrentSession()
				.createQuery("from User").list();
		return list.stream()
				.map(EntityDtoConverter::convert)
				.collect(Collectors.toList());
	}

	public UserDto findById(long id) {
		return null;
	}

	public UserDto findByLogin(String login) {
		return null;
	}

	public long create(UserDto userDto) {
		return 0;
	}

	public void update(UserDto userDto) {

	}
}