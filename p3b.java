public class p3b {
    static String x = "Base";
    static final String y = "Base1";

    public static void main(String[] args) {
        print(x);
        x = "Not Base";
        print(x);
        print(y);
        // y = "Not Base1"; gives error for trying to edit
        print(y);
    }

    final static void print(String text) {
        System.out.println(text);
    }
}
