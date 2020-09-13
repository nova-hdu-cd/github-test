package com.tuya.demo.solution;

/**
 * 链表中倒数第k个节点
 *
 * @author chendong
 * @date 2020/9/10 2:30 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class GetKthFromEnd {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        int cnt = 0;
        ListNode tmp = head;
        while (tmp != null) {
            cnt++;
            tmp = tmp.next;
        }
        for (int i = 0; i < cnt - k; i++) {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode node = getKthFromEnd(n1, 4);
        System.out.println(node.val);
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }
}
