package ua.skillsup.practice.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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


	@Autowired
	private LotHistoryDao historyDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private ItemDao itemDao;
	@Autowired
	private LotDao lotDao;


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

	public LotDto createLot(String login, String item, BigDecimal startPrice, int period) {
		return null;
	}

	public void makeBid(String login, long lotId, BigDecimal newPrice) {

	}

	public List<LotHistoryDto> getLotHistory(long lotId) {
		return null;
	}
}