package design.责任链;

public class Boss extends Leader {
    @Override
    public int limit() {
        return 50000;
    }

    @Override
    public void handle(int money) {

        System.out.println("boss 批复了"+money);

    }
}
