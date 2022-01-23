package Questions;
import java.util.*;
public class Q_217_Contains_Duplicates {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            if(nums.length == 0 || nums ==null){
                return false;
            }
            Arrays.sort(nums);
            for(int i = 1 ; i<nums.length;i++){
                if(nums[i-1]==nums[i]){
                    return true;
                }
            }return false;
        }
    }
    
}
