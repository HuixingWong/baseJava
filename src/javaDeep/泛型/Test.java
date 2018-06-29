package javaDeep.泛型;

import jdk.nashorn.internal.parser.JSONParser;
import jdk.nashorn.internal.runtime.JSONListAdapter;

import java.util.List;

public class Test {


    public static <T> List<T> parsetArray(String response,Class<T> object){

        List<T> modolList = (List<T>) JSONListAdapter.create(object);

        return modolList;

    }

    public static void main(String[] args) {

        List<String> list = Test.parsetArray("fuck", String.class);



    }


}
