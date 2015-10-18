package ua.skillsup.practice.hibernate.model.filter;

/**
 * Created by oleksii on 10/10/15.
 */
public class ItemFilter {

	private Double weightFrom;
	private Double weightTo;
	private Double widthFrom;
	private Double widthTo;
	private Double heightFrom;
	private Double heightTo;

	public Double getWeightFrom() {
		return weightFrom;
	}

	public void setWeightFrom(Double weightFrom) {
		this.weightFrom = weightFrom;
	}

	public Double getWeightTo() {
		return weightTo;
	}

	public void setWeightTo(Double weightTo) {
		this.weightTo = weightTo;
	}

	public Double getWidthFrom() {
		return widthFrom;
	}

	public void setWidthFrom(Double widthFrom) {
		this.widthFrom = widthFrom;
	}

	public Double getWidthTo() {
		return widthTo;
	}

	public void setWidthTo(Double widthTo) {
		this.widthTo = widthTo;
	}

	public Double getHeightFrom() {
		return heightFrom;
	}

	public void setHeightFrom(Double heightFrom) {
		this.heightFrom = heightFrom;
	}

	public Double getHeightTo() {
		return heightTo;
	}

	public void setHeightTo(Double heightTo) {
		this.heightTo = heightTo;
	}

	@Override
	public String toString() {
		return "ItemFilter{" +
				"weightFrom=" + weightFrom +
				", weightTo=" + weightTo +
				", widthFrom=" + widthFrom +
				", widthTo=" + widthTo +
				", heightFrom=" + heightFrom +
				", heightTo=" + heightTo +
				'}';
	}
}
