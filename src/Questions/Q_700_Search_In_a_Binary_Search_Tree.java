package Questions;

public class Q_700_Search_In_a_Binary_Search_Tree {
  
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
    return null;    }
    if(root.val == val ){
    return root;    
    }
       TreeNode l =  searchBST(root.left,val);
       TreeNode r = searchBST(root.right,val);
        if(l != null){
            return l;
        }
        else if ( r!= null){
        return r;
        }
       return null;
        
    }
}
    
}
