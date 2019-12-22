//二叉树的最大深度
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? 1 + left : 1 + right;
    }
}