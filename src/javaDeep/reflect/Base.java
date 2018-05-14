package javaDeep.reflect;
public class Base {
    public String b;
    protected String  d;

    void testDefault0(){};

    public void testPublic0(){}

    protected void testProtected0(){

        System.out.println("跑到了tstproject");
    }

    protected void testProtected1(String str){

        System.out.println(str);
    }

    private void testPrivate0(){}


    class enclosingClass{};

    public interface testInterface{}
}