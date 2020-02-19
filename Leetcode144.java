class Solution {
    public void _preOrder(TreeNode root,List<Integer> list){
        if(root != null){
            list.add(root.val);
            _preOrder(root.left,list);
            _preOrder(root.right,list);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> list = new ArrayList<>();
      _preOrder(root,list);
      return list;
    }
}