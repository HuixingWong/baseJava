package design;


import java.util.Observable;
import java.util.Observer;

public class Ls extends Observable implements relax{


    @Override
    public void eat() {
        System.out.print("ls eat");
        super.setChanged();
        super.notifyObservers("qiuku is eating");

    }

    @Override
    public void play() {

        System.out.print("ls play");
        super.setChanged();
        super.notifyObservers("qiuku is playing");

    }

    @Override
    public void singSong() {
        System.out.print("ls sing a song");
        super.setChanged();
        super.notifyObservers("qiuku is sing qiuku song");

    }
}
