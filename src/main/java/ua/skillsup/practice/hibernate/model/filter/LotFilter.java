package ua.skillsup.practice.hibernate.model.filter;

import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.UserDto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by oleksii on 10/10/15.
 */
public class LotFilter {

	private LocalDate dateCreatedFrom;
	private LocalDate dateCreatedTo;
	private LocalDate dateEndFrom;
	private LocalDate dateEndTo;
	private UserDto owner;
	private UserDto currentBuyer;
	private BigDecimal currentPriceFrom;
	private BigDecimal currentPriceTo;
	private ItemDto item;

	public LocalDate getDateCreatedFrom() {
		return dateCreatedFrom;
	}

	public void setDateCreatedFrom(LocalDate dateCreatedFrom) {
		this.dateCreatedFrom = dateCreatedFrom;
	}

	public LocalDate getDateCreatedTo() {
		return dateCreatedTo;
	}

	public void setDateCreatedTo(LocalDate dateCreatedTo) {
		this.dateCreatedTo = dateCreatedTo;
	}

	public LocalDate getDateEndFrom() {
		return dateEndFrom;
	}

	public void setDateEndFrom(LocalDate dateEndFrom) {
		this.dateEndFrom = dateEndFrom;
	}

	public LocalDate getDateEndTo() {
		return dateEndTo;
	}

	public void setDateEndTo(LocalDate dateEndTo) {
		this.dateEndTo = dateEndTo;
	}

	public UserDto getOwner() {
		return owner;
	}

	public void setOwner(UserDto owner) {
		this.owner = owner;
	}

	public UserDto getCurrentBuyer() {
		return currentBuyer;
	}

	public void setCurrentBuyer(UserDto currentBuyer) {
		this.currentBuyer = currentBuyer;
	}

	public BigDecimal getCurrentPriceFrom() {
		return currentPriceFrom;
	}

	public void setCurrentPriceFrom(BigDecimal currentPriceFrom) {
		this.currentPriceFrom = currentPriceFrom;
	}

	public BigDecimal getCurrentPriceTo() {
		return currentPriceTo;
	}

	public void setCurrentPriceTo(BigDecimal currentPriceTo) {
		this.currentPriceTo = currentPriceTo;
	}

	public ItemDto getItem() {
		return item;
	}

	public void setItem(ItemDto item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "LotFilter{" +
				"dateCreatedFrom=" + dateCreatedFrom +
				", dateCreatedTo=" + dateCreatedTo +
				", dateEndFrom=" + dateEndFrom +
				", dateEndTo=" + dateEndTo +
				", owner=" + owner +
				", currentBuyer=" + currentBuyer +
				", currentPriceFrom=" + currentPriceFrom +
				", currentPriceTo=" + currentPriceTo +
				", item=" + item +
				'}';
	}
}
