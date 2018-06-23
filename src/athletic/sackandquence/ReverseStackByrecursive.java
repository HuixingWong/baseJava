package athletic.sackandquence;

import java.util.Stack;

public class ReverseStackByrecursive {

    public static int getAndRemoveLastElement(Stack<Integer> stack){


        int result = stack.pop();
        if (stack.isEmpty()){

            return result;

        }else {

            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;

        }

    }


    public static void  reserve(Stack<Integer> stack){

        if (stack.isEmpty()){
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reserve(stack);
        stack.push(i);
    }


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<30;i++){

            stack.push(30-i);

        }


//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }

        reserve(stack);

        while (! stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }


}
