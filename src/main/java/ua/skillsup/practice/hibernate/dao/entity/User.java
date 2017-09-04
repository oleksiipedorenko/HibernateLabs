package ua.skillsup.practice.hibernate.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Created by oleksii on 10/10/15.
 */
@Entity
@Table(name = "AUCTION_CLIENT")
public class User {

	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "LOGIN", nullable = false, unique = true)
	private String login;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "DELIVERY_ADDRESS", nullable = false)
	private String deliveryAddress;
	@Column(name = "CONTACT_PHONE", nullable = false, unique = true)
	private String contactPhone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(id, user.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", login='" + login + '\'' +
				", name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", deliveryAddress='" + deliveryAddress + '\'' +
				", contactPhone='" + contactPhone + '\'' +
				'}';
	}
}