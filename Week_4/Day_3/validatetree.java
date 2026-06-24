class Solution {
    public boolean isValidBST(TreeNode root) {
       
return helper(root,null,null);
    }
public boolean helper(TreeNode node, Integer low , Integer High){
    if(node == null){ 
            return true;
        }

        if( low != null && node.val <= low ){
           return false;
        }

        if(High != null && node.val >= High  ){
        return false;
        }

        boolean leftcheck =helper(node.left , low ,node.val);
        boolean rightcheck =helper(node.right , node.val ,High);

        return leftcheck && rightcheck;
}
}
