package Structural.Adapter;

public class AMD implements Part{


    @Override
    public void Cpu() {
        System.out.println("AMD cpu");
    }

    @Override
    public void Gpu() {
        System.out.println("AMD Gpu");
    }
}
