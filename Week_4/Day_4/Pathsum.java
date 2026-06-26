class Solution {
    int sum =0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
         if(root == null){
            return false;
        }
        sum+= root.val;
       
        if(sum == targetSum && root.left== null && root.right == null){
            return true;
        }
        boolean left= hasPathSum(root.left,targetSum);
         boolean right = hasPathSum(root.right,targetSum);
       sum-= root.val;
        return left || right;
            }
}
