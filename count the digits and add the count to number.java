import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;
        int x = n;

        while (x > 0) {
            cnt++;
            x = x / 10;
        }

        System.out.println(n+cnt);
    }
}



Input: 9999 (4 digits)

Output: 9999 + 4 = 10003