import java.util.*;
public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        sc.close();
        boolean[] alphabet=new boolean[26]; 
        int count=0;
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c>='a' && c<='z') {
                int index =c-'a';
                if (!alphabet[index]) { 
                    alphabet[index]=true;
                    count++;
                }
            }
        }
        if (count==26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
