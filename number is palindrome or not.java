import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = new Scanner(System.in).nextInt(), x = n, rev = 0;
        while (x>0) {
            rev = rev*10+x%10; 
            x/=10; 
	}
            System.out.println(n == rev ? "Palindrome" : "Not Palindrome");
    }
}
