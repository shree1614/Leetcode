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
    public TreeNode build(int[]postorder,int postStart,int postEnd,int []inorder,int inStart, int inEnd,Map<Integer,Integer> inMap){
        if(postStart>postEnd || inStart>inEnd) return null;
        
        TreeNode root=new TreeNode(postorder[postEnd]);
        int inRoot=inMap.get(root.val);
        int numsLeft=inRoot-inStart;
        
        //   root.left=build(postorder,postEnd-1,postEnd-numsLeft,inorder,inStart,inRoot-1,inMap);
        // root.right=build(postorder,postEnd-numsLeft-1,postStart,inorder,inRoot+1,inEnd,inMap);
        
        //striver
        root.left=build(postorder,postStart,postStart+numsLeft-1,inorder,inStart,inRoot-1,inMap);
        root.right=build(postorder,postStart+numsLeft,postEnd-1,inorder,inRoot+1,inEnd,inMap);
        
        
        
        // root.left=build(postorder,postStart,postStart+numsLeft,inorder,inStart,inRoot-1,inMap);
        // root.right=build(postorder,postStart+numsLeft+1,postEnd-1,inorder,inRoot+1,inEnd,inMap);
        
        return root;
            
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder==null ||inorder==null ||inorder.length!=postorder.length) return null;
        Map<Integer,Integer> inMap=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
            inMap.put(inorder[i],i);
        
        TreeNode root=build(postorder,0,postorder.length-1,inorder,0,inorder.length-1,inMap);
     //   TreeNode root=build(postorder,postorder.length-1,0,inorder,0,inorder.length-1,inMap);
        return root;
    }
}