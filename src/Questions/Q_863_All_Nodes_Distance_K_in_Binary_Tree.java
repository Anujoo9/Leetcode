package Questions;
import java.util.*;
public class Q_863_All_Nodes_Distance_K_in_Binary_Tree {
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
    static ArrayList< TreeNode> path;
     static ArrayList< Integer> ans;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
      path = new ArrayList<>();
        ans = new ArrayList<>();
        find(root, target.val);
        for (int i = 0; i < path.size(); i++) { //2
      printKLevelsDown(path.get(i), k - i, i == 0 ? null : path.get(i - 1)); //3
    }return ans;
    }
    public static void printKLevelsDown(TreeNode node, int k, TreeNode blocker) {
    if (node == null || k < 0 || node == blocker)
      return;
    if (k == 0){
         ans.add(node.val);}
    printKLevelsDown(node.left, k - 1, blocker);
    printKLevelsDown(node.right, k - 1, blocker);

  }
    
    public static boolean find(TreeNode node, int data) {
    if (node == null)
      return false;
    if (node.val == data) {
      path.add(node);
      return true;
    }
    boolean filc = find(node.left, data);
    if (filc) {
      path.add(node);
      return true;
    }
    boolean firc = find(node.right, data);
    if (firc) {
      path.add(node);
      return true;
    }
    return false;
  }
}
