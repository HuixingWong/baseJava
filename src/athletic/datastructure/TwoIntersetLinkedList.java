package athletic.datastructure;

import design.责任链.Boss;

public class TwoIntersetLinkedList {


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

        node1.next = node2;
        node2.next = node3;
        node3.next = node8;

        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node8;

//        Node loopFirstnode = getLoopFirstnode(node1);
//        if (loopFirstnode != null){
//            System.out.println(loopFirstnode.value);
//        }

        Node intersetFirastNode = getIntersetFirastNode(node1, node6);

        if (intersetFirastNode != null) {
            System.out.println(intersetFirastNode.value);
        }

    }


    public static Node getIntersetFirastNode(Node head1, Node head2) {


        //如果任何一个为空，就不可能存在相交节点
        if (head1 == null || head1 == null) {
            return null;
        }


        Node loop1 = getLoopFirstnode(head1);
        Node loop2 = getLoopFirstnode(head2);


        if (loop1 == null && loop2 == null) {

            return getNodeNoLoop(head1, head2);


        }

        if (loop1 != null && loop2 != null) {

            return getNodeBothLoop(head1, loop1, head2, loop2);

        }


        return null;

    }

    private static Node getNodeBothLoop(Node head1, Node loop1, Node head2, Node loop2) {


        if (loop1 == loop2){

            int n = 0;
            Node cur1 = head1;
            Node cur2 = head2;

            while (cur1 != loop1){
                n++;
                cur1 = cur1.next;
            }
            while (cur2 != loop1){
                n--;
                cur2 = cur2.next;
            }

            cur1 = n > 0 ? head1 : head2;
            cur2 = n > 0 ? head2 : head1;
            n = Math.abs(n);
            while (n > 0) {
                n--;
                cur1 = cur1.next;
            }

            while (cur1 != cur2) {
                if (cur1.next != null && cur2.next != null) {
                    cur1 = cur1.next;
                    cur2 = cur2.next;
                } else {
                    return null;
                }
            }

            return cur1;

        }else {

            Node cur = loop1.next;
            while (cur != loop1){

                if (cur == loop2){
                    return loop1;
                }
                cur = cur.next;
            }

            return null;

        }

    }

    private static Node getNodeNoLoop(Node head1, Node head2) {

        int n = 0;
        Node cur1 = head1;
        Node cur2 = head2;
        while (cur1.next != null) {

            n++;
            cur1 = cur1.next;

        }

        while (cur2.next != null) {

            n--;
            cur2 = cur2.next;

        }

        if (cur1 != cur2) {

            return null;

        }

        cur1 = n > 0 ? head1 : head2;
        cur2 = n > 0 ? head2 : head1;
        n = Math.abs(n);
        while (n > 0) {
            n--;
            cur1 = cur1.next;
        }

        while (cur1 != cur2) {
            if (cur1.next != null && cur2.next != null) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            } else {
                return null;
            }
        }

        return cur1;
    }

    //获得第一个入环节点，如果存在的话
    public static Node getLoopFirstnode(Node head) {

        //如果只有一个节点，肯定不会形成环
        if (head.next == null) {
            return null;
        }

        Node cur1 = head;
        Node cur2 = head;

        cur1 = cur1.next;
        cur2 = cur2.next.next;

        while (cur1 != cur2) {

            if (null != cur1.next && null != cur2.next && null != cur2.next.next) {
                cur1 = cur1.next;
                cur2 = cur2.next.next;
            } else {
                return null;
            }
        }

        cur2 = head;
        while (cur1 != cur2) {

            cur1 = cur1.next;
            cur2 = cur2.next;

        }

        return cur1;

    }

    public static class Node {

        public int value;
        public Node next;

        public Node(int data) {

            this.value = data;

        }

    }

}
