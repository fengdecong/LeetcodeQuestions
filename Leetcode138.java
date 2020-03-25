//复制带随机指针的链表
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node cur = head;
		//在链表中插入 val相等的 copy链表    1-2-3-4   --->   1-1-2-2-3-3-4-4
        while(cur != null){
            Node next = cur.next;
            Node copy = new Node(cur.val);
            cur.next = copy;
            copy.next = next;
            cur = next;
        }
		//给插入的元素复制随即指针
        cur = head;
        Node copy = head.next;
        while(cur != null){
            copy = cur.next;
            Node next = copy.next;
            if(cur.random != null){
                copy.random = cur.random.next;}
            else
                copy.random = null;
            cur = next;
        }
		//把链拆分
        cur = head;
        Node newH = head.next;
        copy = newH;
        while(cur != null){
            Node next = copy.next;
            cur.next = next;
            if(next != null)
                copy.next = next.next;
            cur = next;
            copy = copy.next;
        }
        return newH;
    }
}