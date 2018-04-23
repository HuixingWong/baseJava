package io;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeFileContent {


    public static void main(String... a) {

        File file = new File
                ("/Users/dogoodsoft-app/Desktop/abc.json");

        if (!file.exists()) {
            return;
        }

        long l = System.currentTimeMillis();

        try {
            Long fileLength = file.length();
            byte[] fileContext = new byte[fileLength.intValue()];
            FileInputStream in = new FileInputStream(file);
            in.read(fileContext);
            in.close();
            String str = new String(fileContext);


//            String pattren = "<>.*<>";
//            Pattern r = Pattern.compile(pattren);
//            Matcher matcher = r.matcher(str);
//            str = matcher.replaceAll("<> iiiiiiiooooooo <>");


//            String patttren1 = "this\\s+is\\s+text";
//            Pattern r1 = Pattern.compile(patttren1);
//            Matcher matcher1 = r1.matcher(str);
//           str =  matcher1.replaceAll("我变了");

//            String pattren = "this[\\S\\s]*is[\\S\\s]*a[\\S\\s]*dog";
//            Pattern r = Pattern.compile(pattren);
//            Matcher matcher = r.matcher(str);
//            str = matcher.replaceAll("this is a dog");


//            String pattren = "this[\\S\\s]*is[\\S\\s]*a[\\S\\s]*dog";
//            Pattern r = Pattern.compile(pattren);
//            Matcher matcher = r.matcher(str);
//            str = matcher.replaceFirst("this is a dog");

            String pattren = "[\\s\\S]";
            Pattern r = Pattern.compile(pattren);
            Matcher matcher = r.matcher(str);
            str = matcher.replaceFirst("this is a dog");


//            str=str.replace("文件","<> lalalla <>");

            PrintWriter out = new PrintWriter(file);
            out.write(str.toCharArray());
            out.flush();
            out.close();


            long l2 = System.currentTimeMillis();

            System.out.println(l2 - l);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
