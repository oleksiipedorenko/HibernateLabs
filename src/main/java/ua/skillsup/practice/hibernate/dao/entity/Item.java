package ua.skillsup.practice.hibernate.dao.entity;

import java.util.Objects;

/**
 * Created by oleksii on 10/10/15.
 */
public class Item {

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
		Item item = (Item) o;
		return Objects.equals(id, item.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", width=" + width +
				", height=" + height +
				", weight=" + weight +
				'}';
	}
}
