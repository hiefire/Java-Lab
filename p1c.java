public class p1c {
    String name = "John Wick";
    int age = 40;

    void display() {
        System.out.println("Name: "+ name);    
        System.out.println("Age: "+ age);
    }

    public static void main(String[] args) {
        p1c student = new p1c();
        student.display();
    }
}
