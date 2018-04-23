package design.Template;

public class Client {

    private static final int MAX_COUNT = 6;
    public static void senmail(Mail mail){

        System.out.println("tittle: "+mail.getSubject()
                +"\t收件人: "+mail.getReceiver()+"\t...发送成功");

    }

    public static String getRandString(int maxLength){


        String source = "afwifsfkskfbrbgrb";



        return source;

    }


}
