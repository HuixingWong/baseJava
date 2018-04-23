package base;

public class ThreeTuble<A,B,C> extends TwoTuble<A,B>{


    public final C third;

    public ThreeTuble(A a, B b,C c) {
        super(a,b);
        third = c;
    }

    @Override
    public String toString() {


        return first+","+second+","+third;

    }

}
