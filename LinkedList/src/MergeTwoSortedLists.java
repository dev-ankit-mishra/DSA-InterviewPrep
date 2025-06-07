//Problem Link-https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=study-plan-v2&envId=top-interview-150

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node=new ListNode(-1,null);
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode temp3=node;

        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp3.next=temp1;
                temp1=temp1.next;
                temp3=temp3.next;

            }else{
                temp3.next=temp2;
                temp2=temp2.next;
                temp3=temp3.next;


            }
        }
        if(temp1!=null){
            temp3.next=temp1;

        }else{
            temp3.next=temp2;
        }

        return node.next;
    }
}
