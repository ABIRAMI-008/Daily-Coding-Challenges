class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Count the number of nodes
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // If the head node needs to be removed
        if (count == n) {
            return head.next;
        }

        // Move to the node before the one to delete
        temp = head;
        for (int i = 1; i < count - n; i++) {
            temp = temp.next;
        }

        // Delete the node
        temp.next = temp.next.next;

        return head;
    }
}
