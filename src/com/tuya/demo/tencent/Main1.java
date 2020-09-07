package com.tuya.demo.tencent;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/6 7:47 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node h1 = null;
        Node temp1 = null;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                h1 = new Node(sc.nextInt());
                temp1 = h1;
                continue;
            }
            //创建新节点
            Node newNode = new Node(sc.nextInt());
            temp1.setNext(newNode);
            temp1 = temp1.next;

        }
        Node h2 = null;
        Node temp2 = null;
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            if (i == 0) {
                h2 = new Node(sc.nextInt());
                temp2 = h2;
                continue;
            }
            Node nNode = new Node(sc.nextInt());
            temp2.setNext(nNode);
            temp2 = temp2.next;
        }
        printPart(h1, h2);
    }

    public static void printPart(Node h1, Node h2) {

        while (h1 != null && h2 != null) {
            if (h1.data < h2.data) {
                h2 = h2.next;
            } else if (h1.data > h2.data) {
                h1 = h1.next;
            } else {
                System.out.print(h1.data + " ");
                h1 = h1.next;
                h2 = h2.next;
            }
        }
        System.out.println();
    }

}
