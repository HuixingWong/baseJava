package design.diandioc;

public class People implements Depencies{
    AbstractDrive abstractDrive;


    public People(AbstractDrive abstractDrive){

        this.abstractDrive = abstractDrive;
    }

    public void goOut(){

        abstractDrive.start();
        abstractDrive.run();
        abstractDrive.stop();

    }

    @Override
    public void setDrive(AbstractDrive abstractDrive) {
        this.abstractDrive = abstractDrive;
    }
}
