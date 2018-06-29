package javaDeep.泛型;

public class InfoIml implements Info<String>{

    private String var;

    public InfoIml(String var){

        this.var = var;

    }

    @Override
    public String getvar() {
        return this.var;
    }

    @Override
    public void setvar(String x) {

        this.var = var;
    }


    public static void main(String[] args) {

        InfoIml i = new InfoIml("fuck");
        System.out.println(i.getvar());


    }


}
