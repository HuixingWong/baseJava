package http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {

    private final Socket mSocket;

    public EchoClient(String hot,int port) throws IOException {


        mSocket = new Socket(hot,port);

    }

    public void run() throws IOException {

        //和服务端进行通信

        Thread readerthread = new Thread(this::readResponse);
        readerthread.start();

        OutputStream out = mSocket.getOutputStream();
        byte[] buffer = new byte[1024];

        int n;

        while ((n = System.in.read(buffer)) > 0){
            out.write(buffer,0,n);
        }


    }

    private void readResponse() {

        try {
            InputStream in = mSocket.getInputStream();
            byte [] buffer = new byte[1024];
            int n;
            while ((n = in.read(buffer)) > 0){
                System.out.write(buffer,0,n);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        try {
            EchoClient client = new EchoClient("localhost",9877);
            client.run();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
