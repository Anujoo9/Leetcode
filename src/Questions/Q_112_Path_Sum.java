package Questions;

public class Q_112_Path_Sum {
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
    public boolean hasPathSum(TreeNode root , int targetSum){
        if(root == null ){
            return false;
        }
        if(root.val == targetSum &&(root.left == null && root.right == null)){
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum- root.val);
       
        // or return this for simplicity
        // boolean a = hasPathSum(root.left,targetSum-root.val);
        // boolean b = hasPathSum(root.right,targetSum- root.val);
       
        //  return a || b;
    }
    
}
    
}
