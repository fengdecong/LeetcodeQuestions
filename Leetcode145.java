//二叉树的后序遍历
class Solution {
    public void _backOrder(TreeNode root,List<Integer> list){
        if(root != null){
            _backOrder(root.left,list);
            _backOrder(root.right,list);
            list.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        _backOrder(root,list);
        return list;
    }
}