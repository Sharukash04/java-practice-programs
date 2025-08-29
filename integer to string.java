import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String s=String.valueOf(n);
            if(Integer.parseInt(s)==n){
                System.out.println("Good job");
            }else{
                System.out.println("Wrong answer");
            }
        }catch(Exception e){
            System.out.println("Wrong answer");
        }
    }
}
