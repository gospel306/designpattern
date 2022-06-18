package Creational.factoryMethods.keyboard;

public class SystemKeyboardFactory extends KeyboardFactory{
    @Override
    public Keyboard createKeyboard(String name) {
        switch (name){
            case "corsair": return new CorsairKeyboard();
            case "razer": return new RazerKeyboard();
        }
        return null;
    }
}
