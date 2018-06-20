package design.责任链;

import design.BuilderTest;

public class TestBuilder {


    public static void main(String[] args) {

        BuilderTest me = BuilderTest.builder()
                .setname("huixing")
                .setage("23")
                .sethobby("magic");


        System.out.println(me.getName()+","+me.getHobby()+","+me.getAge());


    }

}
