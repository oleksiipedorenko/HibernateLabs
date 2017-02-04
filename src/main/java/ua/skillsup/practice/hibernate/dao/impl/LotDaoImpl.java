package ua.skillsup.practice.hibernate.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.practice.hibernate.converters.EntityDtoConverter;
import ua.skillsup.practice.hibernate.dao.LotDao;
import ua.skillsup.practice.hibernate.dao.entity.Item;
import ua.skillsup.practice.hibernate.dao.entity.Lot;
import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.model.filter.LotFilter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
public class LotDaoImpl implements LotDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = true)
	public List<LotDto> findAll() {
		List<Lot> list = sessionFactory.getCurrentSession()
				.createQuery("from Lot").list();
		return list.stream()
				.map(EntityDtoConverter::convert)
				.collect(Collectors.toList());
	}

	public LotDto findById(long id) {
		return null;
	}

	public List<LotDto> findByFilter(LotFilter filter) {
		return null;
	}

	@Transactional
	public long create(LotDto lotDto) {
		Lot lot = EntityDtoConverter.convert(lotDto);
		sessionFactory.getCurrentSession().persist(lot);
		return lot.getId();
	}

	public void update(LotDto lotDto) {

	}
}