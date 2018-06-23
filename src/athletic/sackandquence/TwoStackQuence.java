package athletic.sackandquence;

import java.util.Stack;

//使用两个栈，模拟一个队列
public class TwoStackQuence {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQuence(){
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void add(int pushInt){

        stackPush.push(pushInt);

    }

    public int poll(){

        if (stackPop.isEmpty() && stackPush.isEmpty()){
            throw new RuntimeException("this is two stack is null");
        }else if (stackPop.isEmpty()){

            while (! stackPush.empty()){

                stackPop.push(stackPush.pop());

            }

        }

        return stackPop.pop();

    }

    public int peek(){

        if (stackPop.empty() && stackPush.empty()){

            throw  new RuntimeException("this two stack is all null");

        }else if (stackPop.empty()){

            while (! stackPush.empty()){
                stackPop.push(stackPush.pop());
            }

        }

        return stackPop.peek();

    }



}
