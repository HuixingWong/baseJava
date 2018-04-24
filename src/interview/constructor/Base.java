package interview.constructor;

class Base {

    private String name = "base";

    static {

        System.out.println("这里执行了父类的静态代码块");

    }

    public Base() {
        System.out.println("这里执行了父类的构造方法");
        tellName();
        printName();
    }

    public void tellName() {
        System.out.println("Base tell name: " + name);
    }

    public void printName() {
        System.out.println("Base print name: " + name);
    }
}