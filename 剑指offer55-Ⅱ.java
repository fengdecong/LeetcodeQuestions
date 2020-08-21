class Solution {
	//递归实现
    boolean ret = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return ret;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        if(ret == false) return 0;   //一旦不满足直接返回,效率高
        int l = height(root.left);
        int r = height(root.right);
        if(Math.abs(l-r) > 1){
            ret = false;
        }
        return Math.max(l,r)+1;        
    }
}