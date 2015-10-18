package ua.skillsup.practice.hibernate.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by oleksii on 10/10/15.
 */
public class LotDto {

	private Long id;
	private ItemDto item;
	private UserDto owner;
	private LocalDate datePlaced;
	private BigDecimal startPrice;
	private UserDto buyer;
	private BigDecimal currentPrice;
	private LocalDate dateEnd;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ItemDto getItem() {
		return item;
	}

	public void setItem(ItemDto item) {
		this.item = item;
	}

	public UserDto getOwner() {
		return owner;
	}

	public void setOwner(UserDto owner) {
		this.owner = owner;
	}

	public LocalDate getDatePlaced() {
		return datePlaced;
	}

	public void setDatePlaced(LocalDate datePlaced) {
		this.datePlaced = datePlaced;
	}

	public BigDecimal getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(BigDecimal startPrice) {
		this.startPrice = startPrice;
	}

	public UserDto getBuyer() {
		return buyer;
	}

	public void setBuyer(UserDto buyer) {
		this.buyer = buyer;
	}

	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}

	public LocalDate getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LotDto lotDto = (LotDto) o;
		return Objects.equals(id, lotDto.id) &&
				Objects.equals(item, lotDto.item) &&
				Objects.equals(owner, lotDto.owner) &&
				Objects.equals(datePlaced, lotDto.datePlaced) &&
				Objects.equals(startPrice, lotDto.startPrice) &&
				Objects.equals(buyer, lotDto.buyer) &&
				Objects.equals(currentPrice, lotDto.currentPrice) &&
				Objects.equals(dateEnd, lotDto.dateEnd);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, item, owner, datePlaced, startPrice, buyer, currentPrice, dateEnd);
	}

	@Override
	public String toString() {
		return "LotDto{" +
				"id=" + id +
				", item=" + item +
				", owner=" + owner +
				", datePlaced=" + datePlaced +
				", startPrice=" + startPrice +
				", buyer=" + buyer +
				", currentPrice=" + currentPrice +
				", dateEnd=" + dateEnd +
				'}';
	}
}