package Questions;

public class Q_235_Lowest_Common_Ancestor_of_Bianry_Search_Tree {
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      TreeNode node =root;
      if(node.val >p.val && node.val < q.val){
          return node;
      }
     else if(node.val > p.val && node.val> q.val){
         return lowestCommonAncestor(root.left, p,q);
      }else if(node.val < p.val && node.val< q.val){
          return lowestCommonAncestor(root.right, p, q);
      }
      return root;
    }
    
}   
}
