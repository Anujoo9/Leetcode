package Questions;
import java.util.*;
public class Q_88_Merge_Sorted_Array {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // if(m==0 && n ==0){
            //     Arrays.sort(nums1);
            //     return;
            // }
          {
            for(int i = 0 ; i < n ; i++)
                nums1[i + m] = nums2[i];
            Arrays.sort(nums1);
        }  
        }
    }
    
}
