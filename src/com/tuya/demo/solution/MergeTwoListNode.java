package com.tuya.demo.solution;

/**
 * 合并两个有序的链表
 *
 * @author chendong
 * @date 2020/9/10 1:13 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class MergeTwoListNode {


    public static ListNode mergeListNode(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeListNode(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeListNode(l1, l2.next);
            return l2;
        }
    }

    public static ListNode mergeListNodeV2(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode p = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        //这里l1和l2可能有一个为null
        if (l1 == null) {
            p.next = l2;
        } else {
            p.next = l1;
        }
        return head.next;
    }


    public static void main(String[] args) {
        ListNode headFirst = new ListNode(1);
        ListNode n12 = new ListNode(2);
        ListNode n13 = new ListNode(3);
        ListNode headSecond = new ListNode(2);
        ListNode n22 = new ListNode(4);
        ListNode n23 = new ListNode(6);

        headFirst.next = n12;
        n12.next = n13;
        headSecond.next = n22;
        n22.next = n23;

        ListNode listNode = mergeListNodeV2(headFirst, headSecond);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
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
