import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int x = n;
        while (x > 0) {
            int b=x%10;
            sum+=b;
            x=x/10;
        }
        System.out.println(sum);
    }
}
