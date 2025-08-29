import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=1;
        System.out.println("=".repeat(32));
       while(i<=10){
            int b=a*i;
            System.out.println(a+"x"+i+"="+b);
            b=0;
            i++;
        }
        System.out.println("=".repeat(32));
    }
}