package javaDeep.泛型;

public class InfoIml3<T,K,U> implements Info<U> {

    private U var;

    private T x;

    private K y;

    public InfoIml3(U var){

        this.var = var;

    }

    @Override
    public U getvar() {
        return this.var;
    }

    @Override
    public void setvar(U x) {

        this.var = x;
    }

    public static void main(String[] args) {

        InfoIml3<Integer,Double,String>  infoIml3 = new InfoIml3<>("fuck");

        System.out.println(infoIml3.getvar());

    }
}
