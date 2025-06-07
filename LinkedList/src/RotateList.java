//Problem List-https://leetcode.com/problems/rotate-list/description/?envType=study-plan-v2&envId=top-interview-150

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        k=k%length;
        if(k==0) return head;
        int last=length-k;
        temp=head;

        while(last!=1){
            last--;
            temp=temp.next;
        }
        ListNode ptr=temp.next;
        ListNode newHead=ptr;

        while(ptr.next!=null){
            ptr=ptr.next;
        }

        ptr.next=head;
        temp.next=null;

        return newHead;
    }
}
