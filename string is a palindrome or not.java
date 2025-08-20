import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}
