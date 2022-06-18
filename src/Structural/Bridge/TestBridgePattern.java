package Structural.Bridge;

public class TestBridgePattern {
    public static void main(String argsp[])
    {
        Animal tiger = new Tiger(new HuntingMethod2());
        Animal bird = new Bird(new HuntingMethod1());

        tiger.hunt();
        System.out.println("--------------");
        bird.hunt();
    }
}
