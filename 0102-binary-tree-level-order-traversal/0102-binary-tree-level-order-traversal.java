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


//         class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> result=new ArrayList<>();
//         if(root==null) return result;
//         Queue<TreeNode> queue=new LinkedList<>();
//         queue.add(root);
//         queue.add(null);
//         List<Integer> level=new ArrayList<>();
//         while(queue.size()>0){
//             root=queue.remove();
//             while(queue.size()>0 && root!=null){
//                 level.add(root.val);
//                 if(root!=null){
//                     if(root.left!=null)queue.add(root.left);
//                     if(root.right!=null)queue.add(root.right);
//                 }
//                 root=queue.remove();
//             }
//             result.add(level);
//             level=new ArrayList<>();
//             if(queue.size()>0){
//                 queue.add(null);
//             }
//         }
//         return result;
//     }
// }
   


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q =new LinkedList <>();
        List<List<Integer>> list =new LinkedList<List<Integer>>();
        
        if(root==null) return list;
        q.offer(root);
        
        while(!q.isEmpty()){
            int level =q.size();
            List<Integer> sublist =new LinkedList<>();
            for(int i=0; i<level; i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                sublist.add(q.poll().val); 
            }
                list.add(sublist);
        }
        return list;
    }
}











