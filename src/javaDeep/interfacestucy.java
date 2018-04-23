package javaDeep;

import javax.annotation.processing.Processor;
import java.util.Arrays;

public class interfacestucy {


    public static void process(processor p,Object s){

        System.out.println("using procesor "+p.name());
        System.out.println(p.process(s));

    }

    public static String s = "steve jobs is a maracle";

    public static void main(String ... a){

        process(new Upcase(),s);
        process(new LowerCase(),s);
        process(new Splitter(),s);

    }

}


class processor{

        public String name(){

            return  getClass().getSimpleName();

        }

        Object process(Object input){

            return input;
        }

    }



     class Upcase extends processor{
        @Override
        Object process(Object input) {

            return ((String)input).toUpperCase();


        }
    }

     class  LowerCase extends processor{

        @Override
        Object process(Object input) {

            return ((String)input).toLowerCase();

        }
    }

     class Splitter extends processor{


        @Override
        Object process(Object input) {

           return  Arrays.toString(((String)input).split(" "));

        }
    }



