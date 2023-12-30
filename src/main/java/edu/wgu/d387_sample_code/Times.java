package edu.wgu.d387_sample_code;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class Times {

    public static String getTime() {
        ZonedDateTime time = ZonedDateTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        String times = ET.format(timeFormat) + "EST, " + MT.format(timeFormat) + "MST, " + UTC.format(timeFormat) + "UTC";
        return times;
    }
}


