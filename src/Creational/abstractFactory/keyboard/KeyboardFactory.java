package Creational.abstractFactory.keyboard;

public class KeyboardFactory {
    public Keyboard createKeyboard(String type){
        Keyboard keyboard = null;
        switch (type){
            case "Razer":
                keyboard = new RazerKeyboard();
                break;
            case "Corsair":
                keyboard = new CorsairKeyboard();
                break;
        }
        return keyboard;
    }
}
