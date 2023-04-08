/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> res = new ArrayList<String>();
    if (root != null) BT(root, "", res);
    return res;
}
private void BT(TreeNode root, String path, List<String> res) {
if (root.left == null && root.right == null) res.add(path + root.val);
if (root.left != null) BT(root.left, path + root.val + "->", res);
if (root.right != null) BT(root.right, path + root.val + "->",res);
}  
        
    
    
    
    
    
    
    
    
    
    
    
    
    
}