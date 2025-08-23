import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	System.out.print("Enter value of a: ");
        int n=s.nextInt();
	System.out.print("Enter value of b: ");
	int m=s.nextInt();
	if(n>m){
	System.out.print("a is greater");
	}
	else
	   System.out.print("b is greater");
     }
}
	 