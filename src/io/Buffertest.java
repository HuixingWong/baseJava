package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffertest {

    public static void main(String ... a){


        BufferedReader bufferedReader =
                new BufferedReader
                        (new InputStreamReader(System.in));

        String str = null;
        System.out.println("请输入内容");

        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("你输入的内容是:  "+str);


    }

}
