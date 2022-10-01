package Questions;
import java.util.*;
public class Q_653_Two_sum_IV_Input_is_a_BST {
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 
class Solution {
    Map<Integer,Integer> map = new HashMap<>();
     int key = 0;
     public boolean findTarget(TreeNode root, int k) {
         // Queue<TreeNode> queue = new ArrayDeque<>();
         // queue.offer(root);
         // while(!queue.isEmpty()){
         //     root = 
         //     if()
         // }
         find(root);
         for (Integer value : map.values()) {
             if(value*2!=k&&map.containsValue(k - value.intValue()))
                 return true;
         }
         return false;
     }
     void find(TreeNode rr){
          if(rr != null){
          find(rr.left);
          map.put(new Integer(key++), new Integer(rr.val));
          find(rr.right);
         }
     }    
 }
}
