package design.builder;

import java.util.ArrayList;

public abstract class CarModel {


    private ArrayList<String> sequence = new ArrayList<>();

    abstract void tart();
    abstract void stop();
    abstract void alarm();



}
