package design;

import java.util.Observable;
import java.util.Observer;

public class Hx implements Observer {



    @Override
    public void update(Observable o, Object arg) {

        System.out.println("qiuku is start :");
        System.out.println(arg.toString());
        System.out.println("this thing over");

    }


}
