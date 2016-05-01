package ua.skillsup.practice.hibernate.model;

import java.util.Objects;
import java.util.Set;

/**
 * Created by oleksii on 4/30/16.
 */
public class CategoryDto {

	private Long id;
	private String title;
	private String description;
	private Set<ItemDto> items;

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

	public Set<ItemDto> getItems() {
		return items;
	}

	public void setItems(Set<ItemDto> items) {
		this.items = items;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CategoryDto that = (CategoryDto) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(title, that.title) &&
				Objects.equals(description, that.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, description);
	}

	@Override
	public String toString() {
		return "CategoryDto{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
