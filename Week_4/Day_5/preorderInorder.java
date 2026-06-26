class Solution {
    int i=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < inorder.length  ;i++){
            map.put(inorder[i],i);
        }
       return helper(inorder, preorder,0 , inorder.length -1,map);
    }
    public TreeNode helper(int[] inorder ,int[] preorder ,int left , int right , HashMap<Integer,Integer> map){
        if(left> right){
      return null;
        }

        int curr = preorder[i];
        i++;
        TreeNode node = new TreeNode(curr);
        if(left == right){
            return node;
        }
        int inorderindex = map.get(curr);
        
        node.left= helper(inorder,preorder,left,inorderindex-1,map);
        node.right= helper(inorder,preorder,inorderindex+1,right,map);

        return node;

    }
}
