package Questions;

public class Q_98_Validate_BinarySearch_Tree {

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

 public boolean valid(TreeNode node , double min , double max){
     if (node == null){
         return true;
     }
     if(node.val <= min || node.val >= max){
         return false;
     }
     return valid(node.left , min,node.val) && valid(node.right,node.val,max);
 }   
}
