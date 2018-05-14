package design.diandioc;

public class test {

    private static AbstractDrive abstractDrive;

    public static void main(String[] args) {


        abstractDrive = new Car();
        People people = new People(abstractDrive);
        people.goOut();

        abstractDrive = new Bike();
        people.setDrive(abstractDrive);
        people.goOut();

    }
}
