
import java.util.Calendar;
import java.util.GregorianCalendar;

public class p9c {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(), ca = c.getInstance();
        GregorianCalendar gc = new GregorianCalendar(gv(c, 1), gv(c, 2), gv(c, 5));

        print("" + gc.getTime());
    }

    static void print(String t) {
        System.out.println(t);
    }

    static int gv(Calendar c, int field) {
        return c.get(field);
    }
}
