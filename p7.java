import java.util.*;
import java.io.*;

public class p7 {
    public static void main(String[] args) {
        print(new Date());
        for (int j : new Random().ints(10, 0, 100).toArray())
            print(j);

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
            print("File could not be created or read or modified for some reason.");
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(Object x) {
        System.out.println(x);
    }
}