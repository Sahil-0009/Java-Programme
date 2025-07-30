package Practice;

// import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String str = "Hello, World!";
        // System.out.println(str);
        // System.out.println(str.length());

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is : " + name);

        // String FirstName = "Abu";
        // String LastName = "Abu";
        // String Fullname = FirstName + " " + LastName;
        // System.out.println(Fullname);
        // System.out.println(Fullname.length());

        // for (int i = 0; i < Fullname.length(); i++) {
        // System.out.println(Fullname.charAt(i));
        // }

        // if (FirstName.compareTo(LastName) == 0) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // if (FirstName == LastName) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // if (new String("Sahil") == new String("Sahil")) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        String sentence = "My name is Sahil";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}
