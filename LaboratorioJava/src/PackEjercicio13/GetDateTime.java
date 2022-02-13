package PackEjercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetDateTime {
    public static void main(String[] args) {
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora actual: "+dateTime.format(LocalDateTime.now())+".");
    }
}
