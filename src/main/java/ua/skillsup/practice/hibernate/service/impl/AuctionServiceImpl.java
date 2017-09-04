package ua.skillsup.practice.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.practice.hibernate.dao.ItemDao;
import ua.skillsup.practice.hibernate.dao.LotDao;
import ua.skillsup.practice.hibernate.dao.LotHistoryDao;
import ua.skillsup.practice.hibernate.dao.UserDao;
import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.model.LotHistoryDto;
import ua.skillsup.practice.hibernate.model.UserDto;
import ua.skillsup.practice.hibernate.service.AuctionService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by oleksii on 10/10/15.
 */
@Service
public class AuctionServiceImpl implements AuctionService {

	private final LotHistoryDao historyDao;
	private final UserDao userDao;
	private final ItemDao itemDao;
	private final LotDao lotDao;

	@Autowired
	public AuctionServiceImpl(LotHistoryDao historyDao, UserDao userDao, ItemDao itemDao, LotDao lotDao) {
		this.historyDao = historyDao;
		this.userDao = userDao;
		this.itemDao = itemDao;
		this.lotDao = lotDao;
	}


	public List<ItemDto> getAllItems() {
		return null;
	}

	public UserDto getUser(String login) {
		return null;
	}

	public List<LotDto> getUserLots(String login, LocalDate from, LocalDate to) {
		return null;
	}

	public List<LotDto> getAllLots() {
		return null;
	}

	@Transactional
	public LotDto createLot(String login, String title, BigDecimal startPrice, int period) {
		UserDto user = userDao.findByLogin(login);
		ItemDto item = itemDao.findByTitle(title);
		LotDto lot = new LotDto();
		lot.setItem(item);
		lot.setOwner(user);
		lot.setStartPrice(startPrice);
		lot.setCurrentPrice(startPrice);
		lot.setDatePlaced(LocalDate.now());
		lot.setDateEnd(LocalDate.now().plusDays(period));

		long l = lotDao.create(lot);
		lot.setId(l);
		return lot;
	}

	public void makeBid(String login, long lotId, BigDecimal newPrice) {

	}

	public List<LotHistoryDto> getLotHistory(long lotId) {
		return null;
	}
}