package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class Hello {


  public static void main(String ... a){

    PipeIo.Send send = new PipeIo.Send();
    PipeIo.Receive receive = new PipeIo.Receive();

    try {
      send.getOut().connect(receive.getInputStream());
    }catch (Exception e){

      e.printStackTrace();
    }
    new Thread(send).start();
    new Thread(receive).start();


    File file = new File
            ("/Users/dogoodsoft-app/Desktop/abc.json");
    System.err.println("这些在控制台输出");

    try {
      System.setErr(new PrintStream(file));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    System.err.println("这些在文件中才看得到");





  }

}
