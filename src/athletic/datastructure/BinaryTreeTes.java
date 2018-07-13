package athletic.datastructure;

import athletic.sackandquence.ArrayQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTes {


    //判断一棵树是不是完全二叉树的时候，用于判断是否开启单点检测的变量
    static   boolean  leaf = false;

    public static class Node {

        private int value;
        private Node left;
        private Node right;


        public Node(int value) {
            this.value = value;
        }
    }


    //判断一棵二叉树是不是完全二叉树

    public static boolean isBCT(Node root) {

        if (root == null) {

            return false;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            Node node1 = queue.poll();

            if (node1 != null && node1.left == null && node1.right != null) {

                return false;

            }

            if(leaf){

                if (node1.left != null){
                    return false;
                }

            }else {

                if (node1.left != null && node1.right == null){
                    leaf = true;
                }

            }

            if (node1.left != null) {

                queue.offer(node1.left);
            }
            if (node1.right != null) {

                queue.offer(node1.right);

            }


        }


        return true;

    }


    //二叉树的广度优先遍历，使用队列
    public static void widthFirstSerchBinaryTree(Node node) {


        if (node == null) {

            System.out.println("emoty");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {

            Node node1 = queue.poll();
            System.out.println(node1.value);

            if (node1.left != null) {

                queue.offer(node1.left);
            }
            if (node1.right != null) {

                queue.offer(node1.right);

            }


        }

        System.out.println();

    }


    //二叉树的深度优先遍历，使用栈
    public static void deptsTraversal(Node root) {

        if (root == null) {

            System.out.println("this is empty tree");
            return;
        }

        Stack<Node> queue = new Stack<>();
        queue.push(root);

        while (!queue.isEmpty()) {

            Node poll = queue.pop();
            System.out.println(poll.value);

            if (poll.right != null) {

                queue.push(poll.right);
            }

            if (poll.left != null) {

                queue.push(poll.left);
            }


        }

        System.out.println();

    }


    //得到一棵完全二叉树的节点个数（要求，复杂度低于O(n))
    public static int getBCTcount(Node head, int level, int h) {


        int hr = 0;

        if (head == null) {

            return 0;

        }

        if (head.right != null) {

            Node right = head.right;

            while (right.left != null) {
                right = right.left;
                hr++;
            }

            if ((h - level) == (hr + 1)) {

                return (int) (Math.pow(2, h - level) + getBCTcount(head.right, level + 1, h));

            } else {

                return 1 + getBCTcount(head.left, level + 1, h) + getBCTcount(head.right, level + 1, h);

            }
        } else {

            if (head.left != null) {
                return 1 + getBCTcount(head.left, level + 1, h);
            } else {
                return 1;
            }

        }

    }

    public static int getBCTC(Node head) {

        int h = 0;
        Node current = head;
        while (current != null) {

            h++;
            current = current.left;
        }

        return getBCTcount(head, 0, h);
    }


    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node4.left = node8;
        node4.right = node9;

        node5.left = node10;
        node5.right = node11;

        node6.left = node12;

        int bctc = getBCTC(node1);

        System.out.println(bctc);

        widthFirstSerchBinaryTree(node1);

        deptsTraversal(node1);

        System.out.println(isBCT(node1));

    }


}