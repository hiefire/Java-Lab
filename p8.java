import java.io.*;

public class p8 {
    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("1.txt");
            w.write("Hello\nWorld!");
            w.close();

            FileReader r = new FileReader("1.txt");

            int s;

            while ((s = r.read()) != -1)
                System.out.print((char) s);
            r.close();
        } catch (IOException e) {
            System.out.print("File I/0 Error");
        }
    }
}