package design.责任链;

public class Director extends Leader{
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {

        System.out.println("主管批复报销了"+money);
    }


}
