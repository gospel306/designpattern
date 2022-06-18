package Creational.abstractFactory.mouse;

public class MouseFactory {
    public Mouse createMouse(String type){
        Mouse mouse = null;
        switch (type){
            case "Razer":
                mouse = new RazerMouse();
                break;
            case "Corsair":
                mouse = new CorsairMouse();
                break;
        }
        return mouse;
    }
}
