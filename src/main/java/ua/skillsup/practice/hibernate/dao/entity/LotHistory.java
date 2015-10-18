package ua.skillsup.practice.hibernate.dao.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by oleksii on 10/10/15.
 */
public class LotHistory {

	private Long id;
	private Lot lot;
	private User buyer;
	private BigDecimal price;
	private LocalDateTime changeTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
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
		LotHistory that = (LotHistory) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "LotHistory{" +
				"id=" + id +
				", lot=" + lot +
				", buyer=" + buyer +
				", price=" + price +
				", changeTime=" + changeTime +
				'}';
	}
}