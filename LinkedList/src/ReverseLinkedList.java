//Problem Link-https://leetcode.com/problems/reverse-linked-list/description/

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=curr.next;

        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }

        return prev;
    }
}
