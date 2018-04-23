package design.责任链;

public abstract class Leader {


    protected  Leader nextHandler;//上一级别的领导者


    public final void handleReQuest(int money){


        if (money <= limit()){
            handle(money);
        }else {

            if (null != nextHandler){
                nextHandler.handleReQuest(money);
            }

        }

    }

    public abstract int limit();


    public abstract void handle(int money);


}
