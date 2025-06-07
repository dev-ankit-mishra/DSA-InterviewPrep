//Problem Link-https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=study-plan-v2&envId=top-interview-150

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        // Step 1: Calculate the length of the list
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: Calculate the position from the start
        int pos = length - n;

        // Step 3: If we need to remove the head
        if (pos == 0) return head.next;

        // Step 4: Traverse to the node just before the target
        temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        // Step 5: Remove the node
        temp.next = temp.next.next;

        return head;
    }

}
