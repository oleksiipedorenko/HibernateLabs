package ua.skillsup.practice.hibernate.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by oleksii on 10/10/15.
 */
public class LotHistoryDto {

	private Long id;
	private LotDto lot;
	private UserDto buyer;
	private BigDecimal price;
	private LocalDateTime changeTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LotDto getLot() {
		return lot;
	}

	public void setLot(LotDto lot) {
		this.lot = lot;
	}

	public UserDto getBuyer() {
		return buyer;
	}

	public void setBuyer(UserDto buyer) {
		this.buyer = buyer;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDateTime getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(LocalDateTime changeTime) {
		this.changeTime = changeTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LotHistoryDto that = (LotHistoryDto) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(lot, that.lot) &&
				Objects.equals(buyer, that.buyer) &&
				Objects.equals(price, that.price) &&
				Objects.equals(changeTime, that.changeTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, lot, buyer, price, changeTime);
	}

	@Override
	public String toString() {
		return "LotHistoryDto{" +
				"id=" + id +
				", lot=" + lot +
				", buyer=" + buyer +
				", price=" + price +
				", changeTime=" + changeTime +
				'}';
	}
}