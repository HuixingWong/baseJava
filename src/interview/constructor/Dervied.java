package interview.constructor;


/**
 * 执行main方法时，执行Derived类的实例化方法也就是无参构造器方法。
 * 因为Derived继承与Base,所以在执行构造器是隐藏执行父类的无参构造器，
 * 执行Base类无参构造器中的tellName和printName方法，因为这两个方法被Derived重写了，
 * 所以执行Derived类中的tellName和printName方法，但此时name属性还没被初始化，所以输出的是null，
 * 下面两行输出的就是Derived类本身的方法，此时name属性被初始化.
 *
 */

/**
 *
 父类静态变量
 父类静态代码块
 子类静态变量
 子类静态代码块
 父类非静态变量
 父类非静态代码块
 父类构造器
 子类非静态变量
 子类非静态代码块
 子类构造器
 */


/**
 * 当涉及到继承时，按照如下顺序执行：

 执行父类的静态代码块，并初始化父类静态成员变量
 执行子类的静态代码块，并初始化子类静态成员变量
 执行父类的构造代码块，执行父类的构造函数，并初始化父类普通成员变量
 执行子类的构造代码块， 执行子类的构造函数，并初始化子类普通成员变量
 */
public class Dervied extends Base {

    private  String name = "dervied";
    {
        System.out.println("这个时候非静态变量赋值了");
    }

    static {
        System.out.println("这个时候执行了子类的静态代码块");
    }

    public Dervied() {
        System.out.println("这里执行了子类的构造方法");
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
