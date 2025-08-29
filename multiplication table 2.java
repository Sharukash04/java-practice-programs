import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("+----------------------+");
        for (int i=1;i<=10;i++) {
            int b=a*i;
            String line = "| "+a+" x "+i+" = "+b;
            while (line.length()<22) {
                line += " ";
            }
            line+=" |";
            System.out.println(line);
        }
        System.out.println("+----------------------+");
    }
}