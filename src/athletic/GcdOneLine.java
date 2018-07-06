package athletic;

public class GcdOneLine {

    public static int getGcd(int m,int n){


        return  n == 0 ? m : getGcd(n,m%n);

    }


}
