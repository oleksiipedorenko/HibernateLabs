package ua.skillsup.practice.hibernate.dao;

import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.model.filter.LotFilter;

import java.util.List;

/**
 * Created by oleksii on 10/10/15.
 */
public interface LotDao {

	List<LotDto> findAll();
	LotDto findById(long id);
	List<LotDto> findByFilter(LotFilter filter);
	long create(LotDto lotDto);
	void update(LotDto lotDto);

}
