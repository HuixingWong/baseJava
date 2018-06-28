package athletic.sackandquence;

public class ArrayStack {

    private int [] array;

    int size  = 0;
    int index = 0;

    public ArrayStack(int length){

        array = new int[length];

    }

    public void push(int value){

        if (size >= array.length){

            throw new RuntimeException("this stack is full");

        }

        array[index++] = value;
        size ++;

    }

    public int peek(){

        return array[index-1];

    }

    public int pop(){

        if (size <= 0){

            throw new RuntimeException("the stack is empty");

        }

        size --;
        return array[--index];

    }

    public boolean isEmpty(){

        return  size == 0;

    }

    public boolean isFull(){

        return size >= array.length;
    }


    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);



        while (!arrayStack.isEmpty()){

            System.out.println(arrayStack.pop());

        }

        System.out.println("this is the gap=================");
        arrayStack.push(6);
        arrayStack.push(7);
        arrayStack.push(8);
        arrayStack.push(9);
        arrayStack.push(10);

//        while (!arrayStack.isEmpty()){
//
//            System.out.println(arrayStack.pop());
//
//        }

        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.peek());


    }






}
