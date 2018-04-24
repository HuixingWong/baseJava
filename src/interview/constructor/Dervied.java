package interview.constructor;


/**
 * 执行main方法时，执行Derived类的实例化方法也就是无参构造器方法。
 * 因为Derived继承与Base,所以在执行构造器是隐藏执行父类的无参构造器，
 * 执行Base类无参构造器中的tellName和printName方法，因为这两个方法被Derived重写了，
 * 所以执行Derived类中的tellName和printName方法，但此时name属性还没被初始化，所以输出的是null，
 * 下面两行输出的就是Derived类本身的方法，此时name属性被初始化.
 */
public class Dervied extends Base {

    private String name = "dervied";

    public Dervied() {
        tellName();
        printName();
    }

    public void tellName() {
        System.out.println("Dervied tell name: " + name);
    }

    public void printName() {
        System.out.println("Dervied print name: " + name);
    }

    public static void main(String[] args){

        new Dervied();
    }
}
