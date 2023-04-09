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
//  */
// class Solution {
//     List<List<Integer>> res=new ArrayList();
//     public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//         List<Integer> list=new ArrayList();
//         if(root==null) return res;
//          list.add(root.val);
//          return pathSum(root, targetSum-root.val, list);
        
        
//       public List<List<Integer>> pathSum(TreeNode root, int targetSum, List<Integer> list) {
//             if(root==null)return ;
//             if(root.left)
//              if(targetSum==0 && root.left==0 && root.right==0){
//                 res.add(new ArrayList<Integer>(list));
//                  return;
//              }
//             if(root==null) return res;
                 
//             if(root.left != null){
//                      res.add(root.left.val);
//                      pathSum(root.left, targetSum-root.left.val, list);
//                      list.remove(list.size()-1);
//                  }
//             if(root.right!=null){
//                      res.add(root.right.val);
//                      pathSum(root.right, targetSum-root.right.val, list);
//                      list.remove(list.size()-1);
//                   }
//                  return res;
//              }
//         }
//     }
// class Solution {
// //     List<List<Integer>> res=new ArrayList();
// public void findPath(TreeNode root, int sum, List<Integer> subList, List<List<Integer>> list){
//         if(root==null) return ;
//         subList.add(root.val);
        
//         if(root.left==null && root.right==null && sum==root.val)
//             list.add(subList);
        
//         findPath(root.left, sum-root.val, new ArrayList<Integer>(subList), list);
//         findPath(root.right, sum-root.val, new ArrayList<Integer>(subList), list);
//     }
//     public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//         List<List<Integer>> list=new ArrayList<List<Integer>>();
//         findPath(root, targetSum, new ArrayList<Integer>(), list);
//         return list;
//     }
// }


class Solution {
    List<List<Integer>> res=new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list=new ArrayList();
        if(root==null)
            return res;
        list.add(root.val);
        return pathSum(root, targetSum-root.val, list);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum, List<Integer> list) {
        if(targetSum==0 && root.left==null && root.right==null){
            res.add(new ArrayList(list));
            return res;
        }
        if( root==null){
            return res;
        }
        if(root.left!=null){
            list.add(root.left.val);
            pathSum(root.left, targetSum-root.left.val, list);
            list.remove(list.size()-1);
        }
        if(root.right!=null){
            list.add(root.right.val);
            pathSum(root.right, targetSum-root.right.val, list);
            list.remove(list.size()-1);
        }
        return res;
    }
}