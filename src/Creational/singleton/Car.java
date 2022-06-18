package Creational.singleton;

public class Car {
    private static Car instance;
    public String msg;
    private Car(String msg){
        this.msg = msg;
    }
    public static Car getInstance(String msg){
        if(instance == null){
            instance = new Car(msg);
        }
        return instance;
    }

    public void drive(){
        System.out.println("start driving " + this.msg);
    }

    public void parking(){
        System.out.println("parking " + this.msg);
        instance = null;
    }
    public boolean isEnableUseCar(){
        if(instance == null)
            return true;
        return false;
    }
}
