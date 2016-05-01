package ua.skillsup.practice.hibernate.converters;

import ua.skillsup.practice.hibernate.dao.entity.*;
import ua.skillsup.practice.hibernate.model.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by oleksii on 10/10/15.
 */
public final class EntityDtoConverter {

	private EntityDtoConverter() {
		//private default constructor for utility class
	}

	public static Item convert(ItemDto itemDto) {
		if (itemDto == null) {
			return null;
		}
		Item item = new Item();
		item.setId(itemDto.getId());
		item.setTitle(itemDto.getTitle());
		item.setDescription(itemDto.getDescription());
		item.setHeight(itemDto.getHeight());
		item.setWeight(itemDto.getWeight());
		item.setWidth(itemDto.getWidth());
		return item;
	}

	public static ItemDto convert(Item item) {
		if (item == null) {
			return null;
		}
		ItemDto itemDto = new ItemDto();
		itemDto.setId(item.getId());
		itemDto.setTitle(item.getTitle());
		itemDto.setDescription(item.getDescription());
		itemDto.setHeight(item.getHeight());
		itemDto.setWeight(item.getWeight());
		itemDto.setWidth(item.getWidth());

		return itemDto;
	}

	public static User convert(UserDto userDto) {
		if (userDto == null) {
			return null;
		}
		User user = new User();
		user.setId(userDto.getId());
		user.setLogin(userDto.getLogin());
		user.setName(userDto.getName());
		user.setLastName(userDto.getLastName());
		user.setDeliveryAddress(userDto.getDeliveryAddress());
		user.setContactPhone(userDto.getContactPhone());
		return user;
	}

	public static UserDto convert(User user) {
		if (user == null) {
			return null;
		}
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setLogin(user.getLogin());
		userDto.setName(user.getName());
		userDto.setLastName(user.getLastName());
		userDto.setDeliveryAddress(user.getDeliveryAddress());
		userDto.setContactPhone(user.getContactPhone());
		return userDto;
	}

	public static Lot convert(LotDto lotDto) {
		if (lotDto == null) {
			return null;
		}
		Lot lot = new Lot();
		lot.setId(lotDto.getId());
		lot.setItem(convert(lotDto.getItem()));
		lot.setOwner(convert(lotDto.getOwner()));
		lot.setStartPrice(lotDto.getStartPrice());
		lot.setDatePlaced(lotDto.getDatePlaced());
		lot.setBuyer(convert(lotDto.getBuyer()));
		lot.setCurrentPrice(lotDto.getCurrentPrice());
		lot.setDateEnd(lotDto.getDateEnd());
		return lot;
	}

	public static LotDto convert(Lot lot) {
		if (lot == null) {
			return null;
		}
		LotDto lotDto = new LotDto();
		lotDto.setId(lot.getId());
		lotDto.setItem(convert(lot.getItem()));
		lotDto.setOwner(convert(lot.getOwner()));
		lotDto.setStartPrice(lot.getStartPrice());
		lotDto.setDatePlaced(lot.getDatePlaced());
		lotDto.setBuyer(convert(lot.getBuyer()));
		lotDto.setCurrentPrice(lot.getCurrentPrice());
		lotDto.setDateEnd(lot.getDateEnd());
		return lotDto;
	}

	public static LotHistory convert(LotHistoryDto lotHistoryDto) {
		if (lotHistoryDto == null) {
			return null;
		}
		LotHistory lotHistory = new LotHistory();
		lotHistory.setId(lotHistoryDto.getId());
		lotHistory.setLot(convert(lotHistoryDto.getLot()));
		lotHistory.setBuyer(convert(lotHistoryDto.getBuyer()));
		lotHistory.setChangeTime(lotHistoryDto.getChangeTime());
		lotHistory.setPrice(lotHistoryDto.getPrice());
		return lotHistory;
	}

	public static LotHistoryDto convert(LotHistory lotHistory) {
		if (lotHistory == null) {
			return null;
		}
		LotHistoryDto lotHistoryDto = new LotHistoryDto();
		lotHistoryDto.setId(lotHistory.getId());
		lotHistoryDto.setLot(convert(lotHistory.getLot()));
		lotHistoryDto.setBuyer(convert(lotHistory.getBuyer()));
		lotHistoryDto.setChangeTime(lotHistory.getChangeTime());
		lotHistoryDto.setPrice(lotHistory.getPrice());
		return lotHistoryDto;
	}

	public static CategoryDto convert(Category category) {
		if (category == null) {
			return null;
		}
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setId(category.getId());
		categoryDto.setTitle(category.getTitle());
		categoryDto.setDescription(category.getDescription());
		categoryDto.setItems(new HashSet<ItemDto>());
		for (Item item : category.getItems()) {
			categoryDto.getItems().add(convert(item));
		}
		return categoryDto;
	}
}