package base.grne;

import com.sun.org.apache.xpath.internal.operations.String;
import design.Ls;

import java.util.ArrayList;
import java.util.List;

public class Test {


   static List<? extends Number> list;

    public static void main(String[] args) {

        LS<Base> ls = new LS<>();
        Base base = new Base();
        base.setAge(10);
        base.setName("caonima");
        ls.setValue(base);

        Object value = ls.getValue();
        System.out.println(value);

        list = new ArrayList<Integer>();

        for (int i =0;i<10;i++){


        }

    }

}
