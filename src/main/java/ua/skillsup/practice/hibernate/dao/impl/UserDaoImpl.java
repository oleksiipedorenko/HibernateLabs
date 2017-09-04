package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.practice.hibernate.converters.EntityDtoConverter;
import ua.skillsup.practice.hibernate.dao.UserDao;
import ua.skillsup.practice.hibernate.dao.entity.Item;
import ua.skillsup.practice.hibernate.dao.entity.User;
import ua.skillsup.practice.hibernate.model.UserDto;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
@Transactional(readOnly = true)
public class UserDaoImpl implements UserDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<UserDto> findAll() {
		List<User> users = sessionFactory.getCurrentSession()
				.createQuery("from User").list();
		return users.stream().map(EntityDtoConverter::convert).collect(toList());
	}

	public UserDto findById(long id) {
		return null;
	}

	public UserDto findByLogin(String login) {
		User user = (User) sessionFactory.getCurrentSession()
				.createQuery("SELECT u FROM User u WHERE u.login = :login")
				.setParameter("login", login)
				.uniqueResult();

		return EntityDtoConverter.convert(user);
	}

	public long create(UserDto userDto) {
		return 0;
	}

	public void update(UserDto userDto) {

	}
}