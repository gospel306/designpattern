package Structural.Adapter;

public class Apple implements Computer{
    @Override
    public void keyboard() {
        System.out.println("Apple Keyboard");
    }

    @Override
    public void mouse() {
        System.out.println("Apple Mouse");
    }
}
