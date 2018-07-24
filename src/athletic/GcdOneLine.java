package athletic;

public class GcdOneLine {

    public static int getGcd(int m,int n){


        return  n == 0 ? m : getGcd(n,m%n);

    }

    public static void main(String[] args) {

        System.out.println(getGcd(13,39));

    }


}
