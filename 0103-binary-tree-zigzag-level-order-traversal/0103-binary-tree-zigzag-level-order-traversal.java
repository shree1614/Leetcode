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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        queue.add(root);
        boolean rev = false;
        while(!queue.isEmpty()) {
            int count = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i=0; i<count; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                if(rev) {
                    temp.addFirst(node.val);
                } else {
                    temp.add(node.val);
                }
            }
            list.add(temp);
            rev = !rev;
        }
        return list;
    }
}
// Queue<TreeNode> q= new LinkedList<>();
//         List<List<Integer>> list = new ArrayList<>();
        
//         if(root==null) return list;
//         q.add(root);
//          boolean flag=false;  
//         while(!q.isEmpty()){
//             int level=q.size();
//             List<Integer> subList=new LinkedList<Integer>();
            
//             for(int i=0;i<level;i++){ 
                
//                 TreeNode cur=q.poll(); 
//                 if(cur.left!=null)
//                 q.add(cur.left); 
//                 if(cur.right!=null)
//                 q.add(cur.right); 
                
//                 if(flag)
//                     subList.addFirst(cur.val);
//                 else
//                     subList.add(cur.val);
//             }
            
//             list.add(subList);
//             flag=!flag;
//         }
//         return list;
//     }
// }