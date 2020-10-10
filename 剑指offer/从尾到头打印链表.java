//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
		//从头到尾放入栈
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        int i = 0;
        int[] arr = new int[stack.size()];
		//输出
        while(!stack.isEmpty()){
             arr[i] = stack.pop().val;
             i++;
        }
        return arr;
    }
}