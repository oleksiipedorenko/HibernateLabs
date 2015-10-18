package ua.skillsup.practice.hibernate.dao.impl;

import org.springframework.stereotype.Repository;
import ua.skillsup.practice.hibernate.dao.UserDao;
import ua.skillsup.practice.hibernate.model.UserDto;

import java.util.List;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
public class UserDaoImpl implements UserDao {

	public List<UserDto> findAll() {
		return null;
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