//二叉树的层次遍历
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> Mat = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null)
            queue.offer(root);
        while(!queue.isEmpty()){    
            //取出队列中的元素
            int size = queue.size();
            List<Integer> rowNode = new ArrayList<>(); 
            while(size > 0){
                TreeNode topNode = queue.poll();
                //放在同一行
                rowNode.add(topNode.val);
                if(topNode.left != null)
                queue.offer(topNode.left);
                if(topNode.right != null)
                queue.offer(topNode.right);
                --size;
            }
            Mat.add(rowNode);
        }
        return Mat;
    }
}