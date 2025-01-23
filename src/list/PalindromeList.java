package list;

/**
 * @author YoungCR
 * @date 2025/1/15 13:49
 * @descritpion PalindromeList
 */
public class PalindromeList {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, newHead = null, oldHead = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            oldHead.next = newHead;
            newHead = oldHead;
            oldHead = slow;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (newHead != null) {
            if (newHead.val != slow.val) {
                return false;
            }
            newHead = newHead.next;
            slow = slow.next;
        }
        return true;
    }
}
