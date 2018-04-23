package design.责任链;

public class GroupLeder extends Leader {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {

        System.out.println("组长批复了"+money);

    }
}
