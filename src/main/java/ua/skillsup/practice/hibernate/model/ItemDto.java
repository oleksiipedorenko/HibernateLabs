package ua.skillsup.practice.hibernate.model;

import java.util.Objects;

/**
 * Created by oleksii on 10/10/15.
 */
public class ItemDto {

	private Long id;
	private String title;
	private String description;
	private Double width;
	private Double height;
	private Double weight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ItemDto itemDto = (ItemDto) o;
		return Objects.equals(id, itemDto.id) &&
				Objects.equals(title, itemDto.title) &&
				Objects.equals(description, itemDto.description) &&
				Objects.equals(width, itemDto.width) &&
				Objects.equals(height, itemDto.height) &&
				Objects.equals(weight, itemDto.weight);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, description, width, height, weight);
	}

	@Override
	public String toString() {
		return "ItemDto{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", width=" + width +
				", height=" + height +
				", weight=" + weight +
				'}';
	}
}