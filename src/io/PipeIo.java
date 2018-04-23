package io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Executor;

public class PipeIo {

    static class Send implements Runnable{


        private PipedOutputStream out = null;

        public Send(){

            out = new PipedOutputStream();

        }

        public PipedOutputStream getOut() {
            return out;
        }

        @Override
        public void run() {


            String message = "hello pipeiostream";
            try {
                out.write(message.getBytes());
            }catch (Exception e){

                e.printStackTrace();

            }

            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


    static class Receive implements Runnable{

        private PipedInputStream inputStream = null;

        public Receive(){

            inputStream = new PipedInputStream();

        }

        public PipedInputStream getInputStream() {
            return inputStream;
        }

        @Override
        public void run() {

            byte[] b = new byte[1000];

            int len = 0;

            try {
                len = inputStream.read(b);
            }catch (Exception e){

                e.printStackTrace();

            }

            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("接受的内容是"+(new String(b,0,len)));


        }
    }


}
