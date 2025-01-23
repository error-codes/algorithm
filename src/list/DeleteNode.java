package list;

/**
 * @author YoungCR
 * @date 2025/1/15 11:05
 * @descritpion DeleteNode
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
