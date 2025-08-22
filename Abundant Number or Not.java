import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int s=c.nextInt();
        if(s%2==0)
            System.out.print("Abundant Number");
        else
            System.out.print("Not A Abundant Number");
    }
}
