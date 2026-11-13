public class p4 {
    public static void main(String[] args) {

        int x = 5, y = 0, z;

        try {
            z = x/y;
            System.out.println("z = "+z);
        } catch(ArithmeticException e) {
            System.out.println("You tried to divide by zero.");
        }

    }
}
