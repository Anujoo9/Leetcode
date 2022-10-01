package Questions;

public class Q_226_Invert_Binary_Tree {
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
        public class Solution{
            public TreeNode invetrTree(TreeNode root){
                helper(root);
                return root;
            }
            private void helper(TreeNode node){
                if(node == null){
                    return;
                }
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                helper(node.left);
                helper(node.right);
            }
        }
        
    
}
