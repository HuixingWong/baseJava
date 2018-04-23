package base;

public class FourTuble<A,B,C,D> extends ThreeTuble{

    private D four;

    public FourTuble(A a,B b,C c,D d) {
        super(a,b,c);

        four = d;

    }

    @Override
    public String toString() {

        return first+","+second+","+third+","+four;
    }
}
