class Solution {
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {  
    helper(root);
      return ans;
    }
  public int helper(TreeNode root){
           if(root == null){
      return 0;
         }
 int left = Math.max(0,helper(root.left));
  int right =Math.max(0,helper(root.right));
   int pathsum = left+right+root.val;
         ans = Math.max(ans,pathsum);
     return Math.max(left,right) + root.val ;    
     }
}
