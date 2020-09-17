package com.tuya.demo.solution;

import java.util.Stack;

/**
 * 反转链表
 *
 * @author chendong
 * @date 2020/9/14 7:31 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class ReverseListNode {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseListNode(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }

    public ListNode reverseListNodeV2(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode node = stack.pop();

        ListNode dummy = node;

        while (!stack.isEmpty()) {
            dummy.next = stack.pop();
            dummy = dummy.next;
        }

        dummy.next = null;

        return node;

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ReverseListNode reverseListNode = new ReverseListNode();
        //ListNode tail = reverseListNode.reverseListNode(n1);

        ListNode listNode = reverseListNode.reverseListNode(n1);
        print(listNode);

        //print(tail);
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
