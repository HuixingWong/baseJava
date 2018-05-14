package base.grne;

import design.Ls;

public class Test {

    public static void main(String[] args) {

        LS<Base> ls = new LS<>();
        Base base = new Base();
        base.setAge(10);
        base.setName("caonima");
        ls.setValue(base);

        Object value = ls.getValue();
        System.out.println(value);

    }

}
