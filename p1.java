public class p1 {
    String instanceVar = "Instance Variable";
    static String staticVar = "Static Variable";

    public void descVars() {
        String localVar = "Local Variable";

        System.out.println(localVar);
        System.out.println(instanceVar);
        System.out.println(staticVar);
    }

    public static void main(String[] args) {
        p1 P = new p1();

        P.descVars();
    }
}