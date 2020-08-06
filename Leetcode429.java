//给定一个 N 叉树，返回其节点值的层序遍历

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> line = new ArrayList<>();
            for(int i = size;i > 0; i--){
                Node curNode = q.poll();
                line.add(curNode.val);
                List<Node> children = curNode.children;
                for(Node child : children)
                    q.add(child);
            }
            result.add(line);
        }
        return result;
    }
}