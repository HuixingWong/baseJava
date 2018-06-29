package javaDeep.泛型;

public class InfoIml2<T> implements Info<T> {

    private T var;

    public InfoIml2(T var){

        this.var = var;
    }

    @Override
    public T getvar() {
        return this.var;
    }

    @Override
    public void setvar(T x) {

        this.var = x;

    }

    public static void main(String[] args) {


        InfoIml2<String> infoIml2 = new InfoIml2<>("fuck");
        System.out.println(infoIml2.getvar());

    }
}
