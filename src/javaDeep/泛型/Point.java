package javaDeep.泛型;

public class Point<T extends Number> {

    private T x;
    private T y;

    public Point(){

    }
    public Point(T x,T y){
        this.x = x;
        this.y = y;
    }


    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }


    public static void main(String[] args) {

        Point<Integer> point = new Point<>();
        point.setX(10);
        point.setY(20);

        System.out.println("this x is:"+point.getX());


        Point<Float> point1 = new Point<>();
        point1.setY(1.2f);
        point1.setX(14.8f);

        System.out.println("this point is :"+point1.getX());

        // ? 和 T的区别是： 他们完全不一样！！！！

        Point<?> pointN;

        pointN = new Point<>(3,3);
        pointN = new Point<>(1.0f,2.4f);




    }


}