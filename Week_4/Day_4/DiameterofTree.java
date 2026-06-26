class Solution {
    int maxwidth=0;
    public int diameterOfBinaryTree(TreeNode root) {
       helper(root);
       return maxwidth;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
           maxwidth=Math.max(maxwidth,left+right);
           return 1+ Math.max(left,right);
    }
}
