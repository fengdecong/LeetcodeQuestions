class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;  //奇数
        ListNode even = head.next;  //偶数
        ListNode flag =  even;  //标记 因为最后一个奇数还要指回来
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = flag;
        return head;
    }
}