package ua.skillsup.practice.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.practice.hibernate.dao.*;
import ua.skillsup.practice.hibernate.model.*;
import ua.skillsup.practice.hibernate.service.AuctionService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by oleksii on 10/10/15.
 */
@Service
public class AuctionServiceImpl implements AuctionService {


	@Autowired
	private LotHistoryDao historyDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private ItemDao itemDao;
	@Autowired
	private LotDao lotDao;
	@Autowired
	private CategoryDao categoryDao;

	@Transactional(readOnly = true)
	public List<ItemDto> getAllItems() {
		return itemDao.findAll();
	}

	public UserDto getUser(String login) {
		return null;
	}

	public List<LotDto> getUserLots(String login, LocalDate from, LocalDate to) {
		return null;
	}

	public List<LotDto> getAllLots() {
		return lotDao.findAll();
	}

	@Transactional
	public LotDto createLot(String login, String item,
	                        BigDecimal startPrice, int period) {
		LotDto lot = new LotDto();
		lot.setCurrentPrice(startPrice);
		lot.setOwner(userDao.findByLogin(login));
		lot.setDatePlaced(LocalDate.now());
		lot.setDateEnd(LocalDate.now().plusDays(period));
		lot.setItem(itemDao.findByTitle(item));
		long id = lotDao.create(lot);
		lot.setId(id);
		return lot;
	}

	public void makeBid(String login, long lotId, BigDecimal newPrice) {

	}

	public List<LotHistoryDto> getLotHistory(long lotId) {
		return null;
	}

	@Override
	@Transactional
	public Set<ItemDto> getItemsOfCategory(String category) {
		CategoryDto categoryDto = categoryDao.findByTitle(category);
		if (categoryDto == null) {
			return Collections.emptySet();
		}

		return categoryDto.getItems();
	}
}