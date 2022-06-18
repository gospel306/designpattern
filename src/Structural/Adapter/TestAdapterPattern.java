package Structural.Adapter;

public class TestAdapterPattern {
    public static void main(String[] args) {
        Apple apple = new Apple();

        AMD amd = new AMD();
        Computer systemAdapter = new SystemAdapter(amd);

        testComputer(apple);
        testComputer(systemAdapter);

    }

    public static void testComputer(Computer computer){
        computer.keyboard();
        computer.mouse();
    }
}
