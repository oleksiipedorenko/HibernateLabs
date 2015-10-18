package ua.skillsup.practice.hibernate.model;

import java.util.Objects;

/**
 * Created by oleksii on 10/10/15.
 */
public class UserDto {

	private Long id;
	private String login;
	private String name;
	private String lastName;
	private String deliveryAddress;
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
		UserDto userDto = (UserDto) o;
		return Objects.equals(id, userDto.id) &&
				Objects.equals(login, userDto.login) &&
				Objects.equals(name, userDto.name) &&
				Objects.equals(lastName, userDto.lastName) &&
				Objects.equals(deliveryAddress, userDto.deliveryAddress) &&
				Objects.equals(contactPhone, userDto.contactPhone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, login, name, lastName, deliveryAddress, contactPhone);
	}

	@Override
	public String toString() {
		return "UserDto{" +
				"id=" + id +
				", login='" + login + '\'' +
				", name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", deliveryAddress='" + deliveryAddress + '\'' +
				", contactPhone='" + contactPhone + '\'' +
				'}';
	}
}