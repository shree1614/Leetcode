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
//     List <Integer> list=new ArrayList<>();
//     public List<Integer> rightSideView(TreeNode root) {
//     RightSideView(root,list, 0);
//            return list;
//     }
//         public void RightSideView(TreeNode root, ArrayList list, int level){
//         if(root==null) return ;
//         if(list.size()==level) list.add(root.val);
//         RightSideView(root.left,list,level+1);
//         RightSideView(root.right,list,level+1);
    
//     }
// }





List<Integer> list = new ArrayList<>();
public List<Integer> rightSideView(TreeNode root) {
    rsv(root, 0);
    return list;
}

 public void rsv(TreeNode root, int level) {

     if(root==null)  return;
     if(list.size()==level) list.add(root.val);
     rsv(root.right, level+1);
     rsv(root.left, level+1);
}
    
} 
    
//     class Solution {
//     List <Integer> list=new ArrayList<>();
//    public List<Integer> rightSideView(TreeNode root) {
//         if(root==null) return;
//            if(list.get(level)==null)
//         list.add(root);
//         rightSideView(root.left,list,level+1);
//        rightSideView(root.right,list,level+1);
//     }
//     public List<Integer> rightSideView(TreeNode root) {
//         rightSideView(root,list,0);
//         return list;
//     }
// }