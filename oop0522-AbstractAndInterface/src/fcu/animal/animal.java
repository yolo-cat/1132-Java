package fcu.animal;

public abstract class animal {

    private String name;

    public animal(String name) {
        this.name = name;
    }

    public abstract void makesound();

    public void printInfo() {
        System.out.println(name);
    }
}