package Creational.abstractFactory;

import Creational.abstractFactory.keyboard.KeyboardFactory;
import Creational.abstractFactory.mouse.MouseFactory;

public class ComputerFactory {
    public void createComputer(String type){
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        MouseFactory mouseFactory = new MouseFactory();
        keyboardFactory.createKeyboard(type);
        mouseFactory.createMouse(type);
    }
}
