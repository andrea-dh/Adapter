package Grupos;

import java.time.Duration;
import java.time.LocalTime;

public class Dates {
    public static void main(String[] args) {
        LocalTime inicio= LocalTime.of(12,34,43);
        LocalTime fin= inicio.minusHours(3).minusMinutes(40).plusSeconds(12);

        System.out.println(Duration.between(inicio,fin));
    }
}
