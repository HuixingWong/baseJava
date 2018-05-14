package base.grne;

public class LS<T extends Base> {

    T value;

    public Object getValue() {

        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}
