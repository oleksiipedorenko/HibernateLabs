package ua.skillsup.practice.hibernate.dao.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * Created by oleksii on 10/10/15.
 */
@Entity
@Table(name = "ITEM")
public class Item {

	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "TITLE", nullable = false, unique = true)
	private String title;
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	@Column(name = "WIDTH")
	private Double width;
	@Column(name = "HEIGHT")
	private Double height;
	@Column(name = "WEIGHT")
	private Double weight;
	@Version
	@Column(name = "VERSION", nullable = false)
	private int version;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "ITEM_CATEGORY",
			inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID"),
			joinColumns = @JoinColumn(name = "ITEM_ID")
	)
	private List<Category> categoryList;

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

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
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
