public class p4b {
    
    class Parent {
        String who = "Parent";

        void whoami() {
            System.out.println(who);
        }
    }

    class Child extends Parent {
        Child() {
            who = "Child";
        }
    }

    p4b() {

        Parent p = new Parent();
        Child c = new Child();

        p.whoami();
        c.whoami();
    }

    public static void main(String[] args) {
        new p4b();
    }
}
