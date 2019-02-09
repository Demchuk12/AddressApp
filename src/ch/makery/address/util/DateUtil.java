package ch.makery.address.util;

import java.time.LocalDate;
import java.time.format.*;
import javax.swing.text.DateFormatter;

public class DateUtil {
	private static final String DATE_PATTERN = "dd.MM.yyyy";
	private static final DateTimeFormatter DATA_FORMATER = DateTimeFormatter.ofPattern(DATE_PATTERN);
	
	public static String format(LocalDate date) {
		if(date == null) {
			return null;
		}
		return DATA_FORMATER.format(date);
	}
	public static LocalDate parse(String dateString) {
		try {
			return DATA_FORMATER.parse(dateString,LocalDate::from);
		}catch(DateTimeParseException e) {
			return null;
		}
	}
	public static boolean validDate(String dateString) {
		return DateUtil.parse(dateString) != null;
	}

			
}
