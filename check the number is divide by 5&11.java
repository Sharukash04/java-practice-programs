import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
	if(a%5==0&&a%11==0){
	    System.out.print("It is divide by 5&11");
	}
	else {
	    System.out.print("It not is divide by 5&11");
	}
   }
}