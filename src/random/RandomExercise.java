package random;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RandomExercise {
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.of(2020, 12, 11);
        LocalTime time = LocalTime.of(13, 12);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        
        System.out.println(shortDateTime.format(dateTime));
    }
}
