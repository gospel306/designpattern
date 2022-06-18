package Creational.prototype;

import java.util.List;

public class ComputerClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Computer computer = new Computer();
        computer.listAll();

        Computer computer1 = (Computer) computer.clone();
        Computer computer2 = (Computer) computer.clone();

        List<String> computer1List = computer1.getManufacturingCompany();
        List<String> computer2List = computer2.getManufacturingCompany();

        computer1List.add("Dell");
        computer2List.remove("Lenovo");

        System.out.println(computer.getManufacturingCompany());
        System.out.println(computer1List);
        System.out.println(computer2List);
    }
}
