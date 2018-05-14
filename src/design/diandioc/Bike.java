package design.diandioc;

public class Bike implements AbstractDrive{
    @Override
    public void start() {
        System.out.println("自行车启动");
    }

    @Override
    public void run() {

        System.out.println("自行车跑了");
    }

    @Override
    public void stop() {
        System.out.println("自行车到了");

    }
}
