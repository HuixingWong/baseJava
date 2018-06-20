package design;

public class BuilderTest {

    private String name;
    private String age;
    private String hobby;

    private static BuilderTest INSTANCE;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    private BuilderTest(){}

    public static BuilderTest builder(){

        INSTANCE = new BuilderTest();

        return INSTANCE;

    }

    public BuilderTest setname(String name){


        this.setName(name);
        return this;

    }

    public BuilderTest setage(String age){

        this.setAge(age);
        return this;

    }

    public  BuilderTest sethobby(String hobby){

        this.setHobby(hobby);
        return this;

    }
}
