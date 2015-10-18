package ua.skillsup.practice.hibernate.dao.impl;

import org.springframework.stereotype.Repository;
import ua.skillsup.practice.hibernate.dao.LotHistoryDao;
import ua.skillsup.practice.hibernate.model.LotHistoryDto;
import ua.skillsup.practice.hibernate.model.filter.LotHistoryFilter;

import java.util.List;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
public class LotHistoryDaoImpl implements LotHistoryDao {

	public List<LotHistoryDto> findAll() {
		return null;
	}

	public LotHistoryDto findById(long id) {
		return null;
	}

	public List<LotHistoryDto> findByFilter(LotHistoryFilter lotHistoryFilter) {
		return null;
	}

	public long create(LotHistoryDto lotHistoryDto) {
		return 0;
	}
}