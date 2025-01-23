package list;

/**
 * @author YoungCR
 * @date 2025/1/15 17:11
 * @descritpion SplitList
 */
public class SplitList {

    public ListNode[] splitListToParts(ListNode head, int k) {
        int      count = 0;
        ListNode cur   = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        int        step      = count / k;
        int        overflow  = count % k;
        ListNode   curNode   = head;
        ListNode[] listNodes = new ListNode[k];
        for (int i = 0; i < k && curNode != null; i++) {
            listNodes[i] = curNode;
            int partLength = step + (i < overflow ? 1: 0);
            for (int j = 1; j < partLength; j++) {
                curNode = curNode.next;
            }
            ListNode next = curNode.next;
            curNode.next = null;
            curNode = next;
        }
        return listNodes;
    }
}
