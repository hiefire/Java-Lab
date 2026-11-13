public class p3 {

    static String x = "Base";

    public static void main(String[] args) {
        p3 A = new p3(), B = new p3(), C = new p3();

        print(x);
        A.x = "A";
        print(x);
        B.x = "B";
        print(x);
        C.x = "C";
        print(x);
    }

    static void print(String text) {
        System.out.println(text);
    }
}
