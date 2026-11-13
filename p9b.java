
import java.util.Calendar;

public class p9b {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(), ca = c.getInstance();

        pc(ca);
        ca.add(Calendar.YEAR, 1);
        pc(ca);
        print("" + c.after(ca));
        print("" + ca.after(c));
        print("" + c.before(ca));
        print("" + ca.before(c));
        print("" + c.getTime());
        print("" + c.getTimeInMillis());
        print("" + c.getWeeksInWeekYear());
        print("" + c.getWeekYear());
    }

    static void print(String t) {
        System.out.println(t);
    }

    static void pc(Calendar c) {
        print("" + c.get(c.DAY_OF_MONTH) + " " + c.get(c.MONTH) + " " + c.get(c.YEAR));
    }
}
