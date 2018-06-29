package javaDeep.泛型;

import java.security.PublicKey;

public class Use {


   static class Fruit{

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

   static class  Banana extends  Fruit{

        public Banana(){
            setName("banana");
        }

    }

    static class Apple extends Fruit{

        public Apple(){
            setName("apple");
        }

    }


    public static <T extends Fruit> String getFruitname(T t){

        return t.getName();

    }

    public static void main(String[] args) {

        System.out.println(Use.getFruitname(new Apple()));
    }


}
