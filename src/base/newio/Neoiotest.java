package base.newio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.util.Random;

public class Neoiotest {


    public static void main(String[] args) throws IOException {

//        ByteBuffer buf = ByteBuffer.allocate(48);
//        CharBuffer buffer = CharBuffer.allocate(1024);

            RandomAccessFile aFile = new RandomAccessFile
                    ("/Users/dogoodsoft-app/Desktop/a.txt", "rw");
            FileChannel inChannel = aFile.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(48);

//            CharBuffer buffer = CharBuffer.allocate(48);

            int bytesRead = inChannel.read(buf);
            while (bytesRead != -1) {

                System.out.println("Read " + bytesRead);
                buf.flip();

                while(buf.hasRemaining()){
                    System.out.print((char) buf.get());
                }

                buf.clear();
                bytesRead = inChannel.read(buf);
            }
            aFile.close();


    }

}
