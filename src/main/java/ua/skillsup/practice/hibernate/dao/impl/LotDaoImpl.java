package ua.skillsup.practice.hibernate.dao.impl;

import org.springframework.stereotype.Repository;
import ua.skillsup.practice.hibernate.dao.LotDao;
import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.model.filter.LotFilter;

import java.util.List;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
public class LotDaoImpl implements LotDao {

	public List<LotDto> findAll() {
		return null;
	}

	public LotDto findById(long id) {
		return null;
	}

	public List<LotDto> findByFilter(LotFilter filter) {
		return null;
	}

	public long create(LotDto lotDto) {
		return 0;
	}

	public void update(LotDto lotDto) {

	}
}