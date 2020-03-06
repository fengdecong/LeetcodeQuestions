+//判断是否是平衡二叉树  左右子树高度差不能超过1
class Solution {
    public int getHeight(TreeNode root){
        if(root == null)
        return 0;
        return root == null ? 0 : Math.max(getHeight(root.left),getHeight(root.right))               + 1;
        }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        return true;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(Math.abs(left - right) < 2){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }
}