package Questions;
import java.util.*;
public class Q_1_Two_Sum {
    public static void main(String[] args) {
        {
            int [] a = {1 , 4 , 5 , 11 , 12};
            int target = 9;
            for(int x : targetsum(a , target))
                System.out.print(x + " ");
        }
    }
    static int[] targetsum (int[] arr , int target ){//for sorted array
        int left = 0,sum=0;
        int [] ans = new int[2];
        int right = arr.length-1;
        while(left<right){
            sum = arr[left] + arr[right];
            if(sum==target){
                return new int[]{left , right};//+1 will give index of array staring from 1
            }
            if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
    
    public int[] twoSum(int[] nums, int target) {// using HashMap
        HashMap <Integer, Integer> map 
            = new HashMap<Integer, Integer>();
        int complement;
       
        for (int i = 0; i<nums.length; i++) {
            complement = target - nums[i];
           
            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
           
           map.put(nums[i], i);
        }
       
        throw new IllegalArgumentException("No solution");
    }
}
