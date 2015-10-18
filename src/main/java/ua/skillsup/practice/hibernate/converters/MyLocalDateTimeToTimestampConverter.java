package ua.skillsup.practice.hibernate.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by oleksii on 10/10/15.
 */
@Converter(autoApply = true)
public class MyLocalDateTimeToTimestampConverter implements AttributeConverter<LocalDateTime, Timestamp> {
	public Timestamp convertToDatabaseColumn(LocalDateTime localDateTime) {
		return localDateTime == null ? null : java.sql.Timestamp.valueOf(localDateTime);
	}

	public LocalDateTime convertToEntityAttribute(Timestamp timestamp) {
		return timestamp == null ? null : timestamp.toLocalDateTime();
	}
}
