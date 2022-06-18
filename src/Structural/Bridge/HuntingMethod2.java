package Structural.Bridge;

public class HuntingMethod2 implements HuntingHandler{
    public void Find_Quarry()
    {
        System.out.println("지상에서 찾는다");
    }
    public void Detected_Quarry()
    {
        System.out.println("노루 발견");
    }
    public void attack()
    {
        System.out.println("물어뜯는다.");
    }
}
