import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	System.out.print("Enter value of a: ");
        int a=s.nextInt();
	System.out.print("Enter value of b: ");
	int b=s.nextInt();
	if(a<b){
	System.out.print("Smaller value is: "+a);
	}
	else
	   System.out.print("Smaller value is: "+b);
     }
}