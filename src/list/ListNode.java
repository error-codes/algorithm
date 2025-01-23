package list;

/**
 * @author YoungCR
 * @date 2025/1/14 20:50
 * @descritpion ListNode
 */
public class ListNode {

    int      val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
