import java.util.Scanner;
public class Main {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int n=s.length(); 
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i)!=s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Main a=new Main();
        if (a.isPalindrome(num)) {
            System.out.println(num+"is a Palindrome.");
        } else {
            System.out.println(num+"is NOT a Palindrome.");
        }
        sc.close();
    }
}
