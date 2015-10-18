package ua.skillsup.practice.hibernate.dao;

import ua.skillsup.practice.hibernate.model.LotHistoryDto;
import ua.skillsup.practice.hibernate.model.filter.LotHistoryFilter;

import java.util.List;

/**
 * Created by oleksii on 10/10/15.
 */
public interface LotHistoryDao {

	List<LotHistoryDto> findAll();
	LotHistoryDto findById(long id);
	List<LotHistoryDto> findByFilter(LotHistoryFilter lotHistoryFilter);
	long create(LotHistoryDto lotHistoryDto);

}