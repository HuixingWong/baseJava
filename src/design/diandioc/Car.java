package design.diandioc;

public class Car implements AbstractDrive{
    @Override
    public void start() {
        System.out.println("汽车启动");
    }

    @Override
    public void run() {

        System.out.println("汽车跑了");
    }

    @Override
    public void stop() {
        System.out.println("🚗到了");

    }
}
