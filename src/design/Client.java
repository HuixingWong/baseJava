package design;

public class Client {

    public static void main(String ... a){


        Ls ls = new Ls();
        Hx hx = new Hx();
        Hxcopy hxcopy = new Hxcopy();
        ls.addObserver(hx);
        ls.addObserver(hxcopy);

        ls.eat();
        ls.play();
        ls.singSong();


    }
}
