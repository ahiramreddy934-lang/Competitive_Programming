import java.util.*;
public class subarray_sum{
    public static int maxSubarraySum(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cs=Math.max(nums[i],cs+nums[i]);
            ms=Math.max(ms,cs);
        }
        return ms;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSubarraySum(nums));
    }
}