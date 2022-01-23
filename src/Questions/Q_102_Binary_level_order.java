package Questions;
import java.util.*;
public class Q_102_Binary_level_order {
   
//   Definition for a binary tree node.
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null ){
        return new ArrayList<>(); 
        }
        que.add(root);
        while(que.size()>0){
            int count = que.size();
            List<Integer> a = new ArrayList<>();
            for(int i = 0 ; i<count; i++){
            TreeNode temp = que.remove();
            a.add(temp.val);
            if(temp.left !=null){
                que.add(temp.left);
            }
            if(temp.right !=null){
            que.add(temp.right);
            }
            }
            ans.add(a);
            
        }
        return ans;
        
    }
}
    
}
