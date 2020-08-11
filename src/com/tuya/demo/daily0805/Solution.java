package com.tuya.demo.daily0805;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            List<Integer> levels = new ArrayList<>();
            //每次while循环都表示进入下一层，size即每层多少 个 节点
            int size = queue.size();

            //这个for循环有点截断队列queue的意思，不管你队列里面多少个节点，我只截取当层的节点长度，能够刚好遍历完当层所有节点
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();//按顺序一个个取出当层节点
                levels.add(node.val);
                if (node.children != null) {
                    //这个addAll很精髓，把下一层的子节点成堆的加入到队列中去，此时队列里面的结构是这样的 :头 <-上一层节点<-下一层节点<- 尾
                    queue.addAll(node.children);
                }
            }
            list.add(levels);
        }

        return list;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        Node root = new Node(1);
        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        List<Node> c1 = new ArrayList<>();
        c1.add(node3);
        c1.add(node2);
        c1.add(node4);
        root.children = c1;

        List<Node> c2 = new ArrayList<>();
        c2.add(node5);
        c2.add(node6);
        node3.children = c2;

        System.out.println(s.levelOrder(root));
    }
}
