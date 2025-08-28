import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();    
        int nums[]=new int[x];    
        for (int i =0;i<x;i++) {
            nums[i]= s.nextInt();
        }
        int target=s.nextInt();  
        Solution sol=new Solution();
        int result[]=sol.twoSum(nums, target);
        if (result.length==2) {
            System.out.println(result[0]+" "+result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[j]+nums[i]==target) {
                    a[0]=i;
                    a[1]=j;
                    return a; 
                }
            }
        }
        return new int[0]; 
    }
}
