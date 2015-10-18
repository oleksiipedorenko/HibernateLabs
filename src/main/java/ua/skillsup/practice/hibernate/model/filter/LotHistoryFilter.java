package ua.skillsup.practice.hibernate.model.filter;

import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.model.UserDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by oleksii on 10/10/15.
 */
public class LotHistoryFilter {

	private LotDto lot;
	private UserDto buyer;
	private LocalDateTime dateFrom;
	private LocalDateTime dateTo;
	private BigDecimal lotPriceFrom;
	private BigDecimal lotPriceTo;

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

	public LocalDateTime getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDateTime dateFrom) {
		this.dateFrom = dateFrom;
	}

	public LocalDateTime getDateTo() {
		return dateTo;
	}

	public void setDateTo(LocalDateTime dateTo) {
		this.dateTo = dateTo;
	}

	public BigDecimal getLotPriceFrom() {
		return lotPriceFrom;
	}

	public void setLotPriceFrom(BigDecimal lotPriceFrom) {
		this.lotPriceFrom = lotPriceFrom;
	}

	public BigDecimal getLotPriceTo() {
		return lotPriceTo;
	}

	public void setLotPriceTo(BigDecimal lotPriceTo) {
		this.lotPriceTo = lotPriceTo;
	}

	@Override
	public String toString() {
		return "LotHistoryFilter{" +
				"lot=" + lot +
				", buyer=" + buyer +
				", dateFrom=" + dateFrom +
				", dateTo=" + dateTo +
				", lotPriceFrom=" + lotPriceFrom +
				", lotPriceTo=" + lotPriceTo +
				'}';
	}
}
