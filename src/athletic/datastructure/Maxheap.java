package athletic.datastructure;

public class Maxheap {

    public static void main(String ... a){

        int x  =4;
        int y = 20;

        x ^= y;
        y ^= x;
        x ^= y;


        int i = x & y;


        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println(i);
    }

}
