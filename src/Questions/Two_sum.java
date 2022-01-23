/*
package Questions;
import java.util.*;
public class Two_sum_1 {
    public static void main(String[] args) {
      //  Scanner sc  = new Scanner(System.in);
        int[] nums = new int[4];
        int target =9;
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        two(nums, target);
        System.out.println("Fun ");
       

    }
    static void two(int[] arr, int target){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> num = new Stack<>();
        int sum =0;
        int count = 0;
        for(int i =0;i<arr.length;i++){
            int x = arr[i];
            
           
            if(st.size()==0){st.push(x);
            count++;sum=x;}
            else{
                sum =st.peek() + x;
                st.push(x);count++;}
            if(sum == target - i){
                System.out.println(num.peek()+ "--"+i);
            }num.push(i);
        }

    }
}
*/
