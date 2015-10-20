package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.practice.hibernate.dao.LotDao;
import ua.skillsup.practice.hibernate.dao.entity.Item;
import ua.skillsup.practice.hibernate.dao.entity.Lot;
import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.model.filter.LotFilter;

import java.util.ArrayList;
import java.util.List;

import static ua.skillsup.practice.hibernate.converters.EntityDtoConverter.convert;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
@Transactional(readOnly = true)
public class LotDaoImpl implements LotDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<LotDto> findAll() {
		List<Lot> lots = sessionFactory.getCurrentSession().createQuery("from Lot").list();
		List<LotDto> result = new ArrayList<LotDto>(lots.size());
		for (Lot lot : lots) {
			result.add(convert(lot));
		}
		return result;
	}

	public LotDto findById(long id) {
		return null;
	}

	public List<LotDto> findByFilter(LotFilter filter) {
		return null;
	}

	@Transactional(readOnly = false)
	public long create(LotDto lotDto) {
		Lot lot = convert(lotDto);
		sessionFactory.getCurrentSession().save(lot);
		return lot.getId();
	}

	public void update(LotDto lotDto) {

	}
}