//判断是否是镜像对称二叉树
class Solution {
    public boolean _isSymmetric(TreeNode left,TreeNode right) {
        if(left == null && right == null){
            return true;
        }else if(left == null || right == null){
            return false;
        }
        return left.val == right.val && _isSymmetric(left.left,right.right) && _isSymmetric(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
            return _isSymmetric(root.left,root.right);
    }
}