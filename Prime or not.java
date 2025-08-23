import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
	for(int i=2;i<n;i++){
	if(n%i==0){
	System.out.println("Not Prime");
	return n;
}
}
System.out.print("Prime");
}
}