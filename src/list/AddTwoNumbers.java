package list;

/**
 * @author YoungCR
 * @date 2025/1/15 20:25
 * @descritpion AddTwoNumbers
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre      = new ListNode(-1);
        ListNode cur      = pre;
        int      overflow = 0;
        while (l1 != null || l2 != null) {
            int v1  = l1 == null ? 0 : l1.val;
            int v2  = l2 == null ? 0 : l2.val;
            int sum = v1 + v2 + overflow;

            overflow = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (overflow == 1) {
            cur.next = new ListNode(1);
        }
        return pre.next;
    }
}
