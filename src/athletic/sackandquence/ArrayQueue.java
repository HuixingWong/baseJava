package athletic.sackandquence;

public class ArrayQueue {


    private int[] arrayQueue;

    private int start = 0;
    private int index = 0;
    private int size = 0;

    public ArrayQueue(int length) {

        arrayQueue = new int[length];

    }

    public void push(int value) {

        if (size >= arrayQueue.length) {
            throw new RuntimeException("this queue is full");
        }

        arrayQueue[index >= arrayQueue.length ? 0 : index++] = value;
        index = index >= arrayQueue.length ? 0 : index++;
        size++;

    }

    public int poll() {

        if (size <= 0) {
            throw new RuntimeException("this queue is empty");
        }

        size--;
        int result = arrayQueue[start];
        if (start >= arrayQueue.length-1){
            start =0;
        }else {
            start++;
        }
        return result;


    }

    public boolean isEmpty() {


        return size == 0;

    }

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);
        arrayQueue.push(4);
        arrayQueue.push(5);

        while (!arrayQueue.isEmpty()) {

            System.out.println(arrayQueue.poll());

        }

        arrayQueue.push(6);
        arrayQueue.push(7);
        arrayQueue.push(8);
//        arrayQueue.push(9);
//        arrayQueue.push(10);

        while (!arrayQueue.isEmpty()) {

            System.out.println(arrayQueue.poll());

        }

    }


}
