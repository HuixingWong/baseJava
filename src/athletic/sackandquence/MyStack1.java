package athletic.sackandquence;

import java.util.Stack;

public class MyStack1 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1(){

        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum){

        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if (newNum <= this.getMin()){
            this.stackMin.push(newNum);
        }

        this.stackData.push(newNum);

    }

    public int pop(){

        if (this.stackData.isEmpty()){
            throw new RuntimeException(" this stack is null");
        }

        int value = this.stackData.pop();
        if (value == this.getMin()){
            this.stackMin.pop();
        }

        return value;

    }


    public int getMin() {

        if (this.stackMin.isEmpty()){
            throw new RuntimeException("your stak is null");
        }

        return this.stackMin.peek();

    }

    public static void main(String[] args) {
        MyStack1 stack1 = new MyStack1();

        for (int i=0;i< 3000;i++){

            int  v = (int) (Math.random() * 1000);

            stack1.push(v);
            System.out.println(v);

        }

        System.out.println("this min is: "+stack1.getMin());


    }
}
