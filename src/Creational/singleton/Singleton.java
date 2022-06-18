package Creational.singleton;

public class Singleton {
    public static void main(String[] args) {
        Car car = Car.getInstance("K3");
        if(car.isEnableUseCar()){
            car.drive();
        }
        System.out.println(car.msg);
        Car car1 = Car.getInstance("BMW");

        if(car1.isEnableUseCar()){
            car1.drive();
        }
        System.out.println(car.msg);
    }
}
