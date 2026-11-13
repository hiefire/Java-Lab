import java.io.*;

public class p8b {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("1.txt");
            fos.write("Hello\nWorld1!".getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("1.txt");
            int s;
            while ((s = fis.read()) != -1)
                System.out.print((char) s);
        } catch (IOException e) {
            System.out.println("File I/0 Error");
        }
    }
}