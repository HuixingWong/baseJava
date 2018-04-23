package design.责任链;

public class Test {


    public static void main(String[] args) {

        GroupLeder groupLeder = new GroupLeder();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        groupLeder.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        groupLeder.handleReQuest(50000);

    }

}
