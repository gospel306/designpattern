package Creational.factoryMethods.mouse;

public class SystemMouseFactory extends MouseFactory{
    @Override
    public Mouse createMouse(String name) {
        switch (name){
            case "corsair": return new CorsairMouse();
            case "razer": return new RazerMouse();
        }
        return null;
    }
}
