package br.com.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component // transforma em uma classe spring been e também em uma classe injetável
public class DateUtil {

			//data e hora no back
	public String formatLocalDateTimeDatabaseStyle(LocalDateTime localDateTime) {

		return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(localDateTime);

	}
}
