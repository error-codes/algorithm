package list;

/**
 * @author YoungCR
 * @date 2025/1/15 13:16
 * @descritpion CycleList
 */
public class CycleList {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
