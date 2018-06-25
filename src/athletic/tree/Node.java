package athletic.tree;

import java.util.Stack;

//二叉树的前中后序便利，分别采用递归和非递归实现
public class Node {

    public int value;
    public Node left;
    public Node right;

    public Node(int data) {

        this.value = data;
    }

    //前序便利递归实现
    public void preOrderRecur(Node head) {

        if (head == null) {
            return;
        }

        System.out.println("this node is : " + head.value);

        preOrderRecur(head.left);
        preOrderRecur(head.right);

    }

    //中序便利递归实现

    public void inOrderRecur(Node head) {

        if (head == null) {
            return;
        }

        inOrderRecur(head.left);
        System.out.println("this node is : " + head.value);
        inOrderRecur(head.right);

    }

    //后序遍历递归实现

    public void posOrderRecur(Node head) {

        if (head == null) {
            return;
        }

        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println(head.value);

    }

    //前序遍历非递归
    public void preOrderUnRecur(Node head) {

        System.out.print("UnRecur preorder: ");

        if (head != null) {

            Stack<Node> stack = new Stack<>();
            stack.add(head);

            while (!stack.empty()) {

                head = stack.pop();
                System.out.println(value + ",");
                if (head.right != null) {
                    stack.push(head.right);
                }
                if (head.left != null) {
                    stack.push(head.left);
                }

            }
        }

        System.out.println();

    }


    //中序遍历非递归
    public void inOrderUnRecur(Node head) {

        System.out.print("this is in order UnRecur: ");

        if (head != null) {

            Stack<Node> stack = new Stack<>();
            while (!stack.isEmpty() || head != null) {

                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {

                    head = stack.pop();
                    System.out.println(head.value + ",");
                    head = head.right;
                }
            }
        }

        System.out.println();
    }

    public void inOrderUnRecur2(Node head) {


    }


    //后序遍历非递归（两个栈实现）
    public void posorderUnRecur(Node head) {

        System.out.printf("this is pos unrecur :");

        if (head != null) {

            Stack<Node> s1 = new Stack<>();
            Stack<Node> s2 = new Stack<>();

            s1.push(head);

            while (!s1.empty()) {

                head = s1.pop();
                s2.push(head);
                if (head.left != null) {
                    s1.push(head.left);
                }
                if (head.right != null) {
                    s1.push(head.right);
                }

            }

            while (!s2.empty()) {

                System.out.printf(s2.pop().value + ",");

            }
        }
        System.out.println();
    }


    //后序遍历非递归（一个栈实现）
    public void  posorderunRecurOneStack(Node h){

        System.out.printf("this is one stack way: ");


        if (h!= null){

            Stack<Node> stack = new Stack<>();
            stack.push(h);
            Node c = null;

            while (!stack.isEmpty()){

                c = stack.peek();
                if (c.left != null && h != c.left && h!= c.right){

                    stack.push(c.left);

                }else if (c.right != null && h != c.right){

                    stack.push(c.right);

                }else {

                    System.out.printf(stack.pop().value+",");

                    h = c;
                }

            }

        }
        System.out.println();
    }

    //二叉树的边界值打印

    public void printEdge1(Node head){

        if (head == null){
            return;
        }

        int height = getHeight(head,0);
        //使用一个二维数组存放边界节点
        Node [][] edgemap = new Node [height] [2];

        setEageMap(head,0,edgemap);

        //打印左边界
        for (int i=0;i<edgemap.length;i++){

            System.out.println(edgemap[i][0].value+",");

        }
        //打印既不是左边界又不是右边界的叶子节点
        printLeafNotInMap(head,0,edgemap);
        //打印右边界但不是左边界的节点（也就是不包括根节点）
        for (int  i = edgemap.length-1; i != -1;i--){

            if (edgemap[i][0] != edgemap[i][1]){

                System.out.println(edgemap[1]);

            }

        }

        System.out.println();

    }


    //得到从h开始向下的树的高度[i
    private int getHeight(Node h, int l) {

        if (h == null){
            return l;
        }

        return Math.max(getHeight(h.left,l+1),
                getHeight(h.right,l+1));


    }

    public void setEageMap(Node h,int l,Node []
            [] edgemap){

        if (h == null){

            return;

        }

        edgemap[1][0] =
                edgemap[1][0] == null
                        ? h:edgemap[1][0];

        edgemap[1][1] = h;

        setEageMap(h.left,l+1,edgemap);
        setEageMap(h.right,l+1,edgemap);


    }

    public void printLeafNotInMap
            (Node h,int l,Node[][] m){

        if (h == null){

            return;

        }

        if (h.left == null && h.right == null && h!= m[l][0] && h != m[l][1]){

            System.out.println(h.value+",");

        }

        printLeafNotInMap(h.left,l+1,m);
        printLeafNotInMap(h.right,l+1,m);


    }


}
