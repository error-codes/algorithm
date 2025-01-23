package list;

import java.awt.*;

/**
 * @author YoungCR
 * @date 2025/1/15 11:08
 * @descritpion MiddleNode
 */
public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        ListNode l1 = head, l2 = head;
        while (l2 != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return l1;
    }
}
