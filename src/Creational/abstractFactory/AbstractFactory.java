package Creational.abstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer("Corsair");
    }
}
