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

import java.io.Serializable;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by oleksii on 10/10/15.
 */
@Repository
public class LotDaoImpl implements LotDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public LotDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(readOnly = true)
	public List<LotDto> findAll() {
		List<Lot> lots = sessionFactory.getCurrentSession()
				.createQuery("from Lot")
				.list();
		return lots.stream().map(EntityDtoConverter::convert).collect(toList());
	}

	public LotDto findById(long id) {
		return null;
	}

	public List<LotDto> findByFilter(LotFilter filter) {
		return null;
	}

	public long create(LotDto lotDto) {
		Lot lot = EntityDtoConverter.convert(lotDto);
		sessionFactory.getCurrentSession().merge(lot.getItem());
		sessionFactory.getCurrentSession().merge(lot.getOwner());
		sessionFactory.getCurrentSession().save(lot);

		return lot.getId();
	}

	public void update(LotDto lotDto) {

	}
}