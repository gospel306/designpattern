package Creational.factoryMethods;

import Creational.factoryMethods.keyboard.Keyboard;
import Creational.factoryMethods.keyboard.KeyboardFactory;
import Creational.factoryMethods.keyboard.SystemKeyboardFactory;
import Creational.factoryMethods.mouse.Mouse;
import Creational.factoryMethods.mouse.MouseFactory;
import Creational.factoryMethods.mouse.SystemMouseFactory;

public class Factory  {
    public static void main(String[] args) {
        MouseFactory mouseFactory = new SystemMouseFactory();
        KeyboardFactory keyboardFactory = new SystemKeyboardFactory();

        String razer = "razer";
        String corsair = "corsair";

        Mouse mouse1 = mouseFactory.createMouse(razer);
        Keyboard keyboard1 = keyboardFactory.createKeyboard(razer);

        System.out.println(mouse1.getName());
        System.out.println(keyboard1.getName());

        Mouse mouse2 = mouseFactory.createMouse(corsair);
        Keyboard keyboard2 = keyboardFactory.createKeyboard(corsair);

        System.out.println(mouse2.getName());
        System.out.println(keyboard2.getName());
    }

}
