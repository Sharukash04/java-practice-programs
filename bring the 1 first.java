import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') 
                ones++;
        }
        String result = "1".repeat(ones) + "0".repeat(s.length() - ones);
        System.out.println(result);
    }
}
