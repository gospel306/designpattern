package Creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Cloneable {
    private List<String> manufacturingCompany;

    public Computer(){
        this.manufacturingCompany = new ArrayList<>();
    }

    public Computer(List<String> manufacturingCompany){
        this.manufacturingCompany = manufacturingCompany;
    }

    public List<String> getManufacturingCompany(){
        return manufacturingCompany;
    }

    public void listAll(){
        this.manufacturingCompany.add("Samsung");
        this.manufacturingCompany.add("LG");
        this.manufacturingCompany.add("Apple");
        this.manufacturingCompany.add("Lenovo");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return new Computer(new ArrayList<>(this.manufacturingCompany));
    }
}
