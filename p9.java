import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class p9 {
    public static void main(String[] args) {
        Date d = new Date();
        LocalDate ld = LocalDate.now();
        LocalTime t = LocalTime.now();

        print(d.toString());
        print("Date: " + ld.getDayOfMonth() + " " + ld.getMonth() + " " + ld.getYear() + " " + ld.getDayOfWeek());
        print("Time: " + t.getHour() + ":" + t.getMinute() + ":" + t.getSecond());
    }

    static void print(String t) {
        System.out.println(t);
    }
}
