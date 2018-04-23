package base;

public class TwoTuble<A,B> {

    public final A first;
    public final B second;

    public TwoTuble(A a, B b){

        first = a;
        second = b;

    }


    @Override
    public String toString() {

        return " "+first+","+second;

    }
}
