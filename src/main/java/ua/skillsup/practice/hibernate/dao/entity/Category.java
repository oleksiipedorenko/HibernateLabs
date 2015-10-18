package ua.skillsup.practice.hibernate.dao.entity;

import java.util.Objects;

/**
 * Created by oleksii on 10/18/15.
 */
public class Category {

	private Long id;
	private String title;
	private String description;

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