package ua.skillsup.practice.hibernate.service;

import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.model.LotHistoryDto;
import ua.skillsup.practice.hibernate.model.UserDto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by oleksii on 10/10/15.
 */
public interface AuctionService {

	/**
	 * Retrieve all items from the system
	 * @return all known items
	 */
	List<ItemDto> getAllItems();

	/**
	 * Retrieve user details by it's login
	 * @param login user's login
	 * @return all user's information from the system
	 */
	UserDto getUser(String login);

	/**
	 * Get all lot placed by user in chosen date period in the chronological order of date placing
	 * @param login user's login
	 * @param from lower border for date period, pass null if no lower border should be applied
	 * @param to upper border for date period, pass null if no upper period should be applied
	 * @return list of all lots for chosen user in concrete period of time
	 */
	List<LotDto> getUserLots(String login, LocalDate from, LocalDate to);

	/**
	 * Retrieve all lots in the system in chronological order of date ending
	 * @return all lots in the system
	 */
	List<LotDto> getAllLots();

	/**
	 * Create a lot for concrete item
	 * @param login an item owner's login
	 * @param item an item's title
	 * @param startPrice start price for auction lot
	 * @param period days count for auction lot
	 */
	LotDto createLot(String login, String item, BigDecimal startPrice, int period);

	/**
	 * Make new auction bid. User made current bid should be different from current lot buyer.
	 * Also new price should be higher from previous one at least on 0.10$
	 * @param login login of user that made a bid
	 * @param lotId id of lot
	 * @param newPrice new price for this lot
	 */
	void makeBid(String login, long lotId, BigDecimal newPrice);

	/**
	 * Get bid history for concrete lot
	 * @param lotId lot id
	 * @return bid history in chronological order
	 */
	List<LotHistoryDto> getLotHistory(long lotId);

}