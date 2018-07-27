package gc;

public class FinalizeEscapeGC {

    public static FinalizeEscapeGC SAVE_HOKE = null;

    public void isAlive(){

        System.out.println("yes i am still alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalized method is executed");
        FinalizeEscapeGC.SAVE_HOKE = this;
    }

    public static void main(String[] args) throws InterruptedException {

        SAVE_HOKE = new FinalizeEscapeGC();


        //对象第一次成功拯救
        SAVE_HOKE = null;

        System.gc();
        Thread.sleep(500);

        if (SAVE_HOKE != null){
            SAVE_HOKE.isAlive();
        }else {
            System.out.println("no i am dead");
        }


        //第二次失败
        SAVE_HOKE = null;

        System.gc();
        Thread.sleep(500);

        if (SAVE_HOKE != null){
            SAVE_HOKE.isAlive();
        }else {
            System.out.println("no i am dead");
        }





    }

}
