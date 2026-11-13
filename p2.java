public class p2 {

    public p2() {
        String x = "Hello World!";

        print("Original String x: "+x+'\n');

        print("Length: "+x.length());

        print("Character at Index 6: "+x.charAt(6));

        print("Substring 0 - 4: "+x.substring(0, 5));

        print("Concat: "+x.concat(" Hola!"));

        print("Equals \"Hola\": "+x.equals("Hola"));

        print("Compare \"hello world!\": "+x.compareTo("hello world!"));

        print("Compare Ignore Case \"hello world!\": "+x.compareToIgnoreCase("hello world!"));

        print("Contains \"Java\": "+x.contains("Java"));

        print("Starts With \"Hello\": "+x.startsWith("Hello"));

        print("Ends With \"world!\": "+x.startsWith("world!"));

        print("Index of \"o\": "+x.indexOf("o"));

        print("Last Index of \"o\": "+x.lastIndexOf("o"));

        print("Replace: "+x.replace("Hello", "Hola"));

        print("Replace All: "+x.replace("o", "$"));

        print("To Lower Case: "+x.toLowerCase());

        print("To Upper Case: "+x.toUpperCase());

        print("Trim 'x+\"   \"': "+(x+"   ").trim());

        print("Is Empty: "+x.isEmpty());

        temp();
    }

    public static void main(String args[]) {
        new p2();
    }

    void print(String text) {
        System.out.println(text);
    }

    
    void temp() {
        String x = "Java Programming";
        for (String i : x.split(" ")) print(i);
        int y = 100;
        print(String.valueOf(y));
        print(String.join("-", "Java", "C++"));
        for (char i : x.toCharArray()) print(i);;
        
    }

    void print(char text) {
        System.out.println(text);
    }
}