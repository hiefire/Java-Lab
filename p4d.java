public class p4d {
    
    class Parent {
        String who = "GrandParent";

        void whoami() {
            System.out.println(who);
        }
    }

    class Child1 extends Parent {
        Child1() {
            who = "Child1";
        }
    }

    class Child2 extends Parent {
        Child2() {
            who = "Child2";
        }
    }

    p4d() {

        Parent p = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        p.whoami();
        c1.whoami();
        c2.whoami();
    }

    public static void main(String[] args) {
        new p4d();
    }
}
