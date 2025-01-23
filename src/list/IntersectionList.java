package list;

/**
 * @author YoungCR
 * @date 2025/1/15 13:26
 * @descritpion IntersectionList
 */
public class IntersectionList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (headA != null && headB != null) {
            headA = headA.next;
            headB = headB.next;
        }

        while (headA != null) {
            headA = headA.next;
            a = a.next;
        }

        while (headB != null) {
            headB = headB.next;
            b = b.next;
        }

        while (a != b) {
            a = a.next;
            b = b.next;
        }

        return b;
    }
}
