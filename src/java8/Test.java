package java8;

import java.util.Arrays;
import java.util.Optional;

public class Test {

    static  Optional<Defalt> defalt;

    public static void main(String[] args) {

        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );

        Optional< String > firstName = Optional.of( "Tom" );
        System.out.println( "First Name is set? " + firstName.isPresent() );
        System.out.println( "First Name: " + firstName.orElse("[none]") );
        System.out.println( firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
        System.out.println();


        System.out.println(returnLength("sdsf"));

        System.out.println("========================================================");


        User user = new User("dashabi",23);

        String nothing = Optional.ofNullable(user).filter(user1 -> user.getAge() > 10).
                map(User::getName).map(String::toUpperCase).orElse("nothing");


        System.out.println(nothing);

    }


    public static int returnLength(String str){

        return Optional.ofNullable(str).map(String :: length).orElse(0);

    }



    public static Defalt getDefault(){

       defalt  = Optional.of(new Defalt() {
            @Override
            public void doSomething(int i) {

                System.out.println("不是空的，所以返回了这个");

            }
        });


        return defalt.orElse(new Defalt() {
            @Override
            public void doSomething(int i) {

                System.out.println("是空的，所以返回了这个");

            }
        });


    }

}
