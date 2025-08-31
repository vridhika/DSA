class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;  // handle empty or single node

        // Step 1: Find length and last node
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        // Step 2: Make it circular
        tail.next = head;

        // Step 3: Adjust k
        k = k % len;
        if (k == 0) {
            tail.next = null;
            return head;
        }

        // Step 4: Find new last node (len - k)
        ListNode newLastNode = head;
        for (int i = 1; i < len - k; i++) {  // move (len-k-1) steps
            newLastNode = newLastNode.next;
        }

        // Step 5: Break the circle
        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }
}
