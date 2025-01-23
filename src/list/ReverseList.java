package list;

/**
 * @author YoungCR
 * @date 2025/1/14 20:51
 * @descritpion ReverseList
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = pre;
            pre = temp;
        }
        return pre;
    }

}
