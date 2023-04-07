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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      Map<Integer,Integer> inMap= new HashMap<Integer,Integer>();
      for(int i=0; i<inorder.length; i++){
          inMap.put(inorder[i],i);
      }
        
        TreeNode root = constructTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inMap);return root;
    }
            
        public TreeNode constructTree(int[] preorder,int preStart, int preEnd, int[] inorder, int inStart, int inEnd,Map<Integer,Integer> inMap ){
            
            if(preStart>preEnd || inStart>inEnd) return null;
            
            TreeNode root= new TreeNode(preorder[preStart]);
            int inRoot =inMap.get(root.val);
            int numsleft= (inRoot - inStart);
        
            root.left=constructTree( preorder, preStart+1, preStart+numsleft, inorder ,inStart,inRoot-1, inMap);
            root.right= constructTree(preorder, preStart+numsleft+1, preEnd, inorder, inRoot+1, inEnd, inMap);
    return root;
            
        
            
            
    }
}