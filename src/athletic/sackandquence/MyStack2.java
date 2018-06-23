package athletic.sackandquence;

import java.util.Stack;

public class MyStack2 {

    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;


    public MyStack2(){

        dataStack = new Stack<>();
        minStack = new Stack<>();

    }

    public void  push(int numData){

        dataStack.push(numData);
        if (this.minStack.isEmpty()){
            minStack.push(numData);
        }else if (numData < this.getMin()){
            this.minStack.push(numData);
        }else {
            this.minStack.push(this.minStack.peek());
        }

    }

    public int pop(){

        if (this.dataStack.isEmpty()){
            throw new RuntimeException(" this stack is null");
        }

        this.minStack.pop();

        return this.dataStack.pop();
    }


    public int getMin(){

        if (this.minStack.isEmpty()){
            throw new RuntimeException("this is null");
        }

        return this.minStack.peek();

    }



}
