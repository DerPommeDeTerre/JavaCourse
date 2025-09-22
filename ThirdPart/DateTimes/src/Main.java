import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        // How to work with Dates & Times using Java
        //(LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        System.out.println();

        //Custom format
        LocalDateTime DT = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);

        System.out.println(newDateTime);

        System.out.println();

        //Custom DateTime object
        LocalDate customDate = LocalDate.of(2025, 12, 25);
        System.out.println(customDate);
        System.out.println();

        LocalDateTime customDateTime = LocalDateTime.of(2026, 1, 1, 0, 0, 0);
        LocalDateTime customDateTime2 = LocalDateTime.of(2026, 1, 1, 0, 0, 0);
        //System.out.println(customDateTime);

        //Comparing dates
        if(customDateTime.isBefore(customDateTime2)){
            System.out.println(customDateTime + " is earlier than " + customDateTime2);
        } else if(customDateTime.isAfter(customDateTime2)){
            System.out.println(customDateTime + " is later than " + customDateTime2);
        } else if(customDateTime.isEqual(customDateTime2)){
            System.out.println(customDateTime + " is equal to " + customDateTime2);
        }

    }
}
