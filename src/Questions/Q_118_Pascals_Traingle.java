package Questions;

import java.util.*;

public class Q_118_Pascals_Traingle {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
           List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0)
            return result;
     
        List<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        result.add(pre);
     
        for (int i = 2; i <= numRows; i++) {
            List<Integer> cur = new ArrayList<Integer>();
     
            cur.add(1); //first
            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(pre.get(j) + pre.get(j + 1)); //middle
            }
            cur.add(1);//last
     
            result.add(cur);
            pre = cur;
        }
     
        return result;
        }
    }
}
