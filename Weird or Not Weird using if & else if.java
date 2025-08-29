import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if (a%2!=0) {
            System.out.println("Weird");
        } else {
            if (a>=2 && a<=5) {
                System.out.println("Not Weird");
            } else if (a>=6 && a<=20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
        s.close();
    }
} 