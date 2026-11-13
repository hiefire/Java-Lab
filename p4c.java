public class p4c {
    
    class GrandParent {
        String who = "GrandParent";

        void whoami() {
            System.out.println(who);
        }
    }

    class Parent extends GrandParent {
        Parent() {
            who = "Parent";
        }
    }

    class Child extends Parent {
        Child() {
            who = "Child";
        }
    }

    p4c() {

        GrandParent g = new GrandParent();
        Parent p = new Parent();
        Child c = new Child();

        g.whoami();
        p.whoami();
        c.whoami();
    }

    public static void main(String[] args) {
        new p4c();
    }
}
