package ua.skillsup.practice.hibernate.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by oleksii on 10/10/15.
 */
@Converter(autoApply = true)
public class MyLocalDateConverter implements AttributeConverter<LocalDate, Date> {
	public Date convertToDatabaseColumn(LocalDate localDate) {
		return localDate == null ? null : java.sql.Date.valueOf(localDate);
	}

	public LocalDate convertToEntityAttribute(Date date) {
		return date == null ? null : date.toLocalDate();
	}
}