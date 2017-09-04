package ua.skillsup.practice.hibernate.dao.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * Created by oleksii on 10/18/15.
 */
@Entity
@Table(name = "CATEGORY")
public class Category {

	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "DESCRIPTION")
	private String description;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categoryList")
	private List<Item> items;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Category category = (Category) o;
		return Objects.equals(id, category.id) &&
				Objects.equals(title, category.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}
}