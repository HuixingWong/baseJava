package athletic.sackandquence;

import java.util.Stack;

public class JudgeIsOutStack {


    public static  boolean isOutStack(int [] arr1,int [] arr2){

        if (null == arr1 || null == arr2 || arr1.length == 0 || arr2.length == 0 || arr1.length != arr2.length){

            return  false;
        }

        Stack<Integer> stack = new Stack<>();

        int index = 0;

        for (int i=0;i<arr1.length;i++){

            stack.push(arr1[i]);

            while (!stack.isEmpty() && stack.peek() == arr2[index]){

                stack.pop();
                index++;

            }

        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {3,1,4,5,2};

        System.out.println(isOutStack(arr1,arr2));


    }

}
