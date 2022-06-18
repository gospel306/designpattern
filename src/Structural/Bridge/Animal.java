package Structural.Bridge;

public class Animal {
    private HuntingHandler hunting;

    public Animal(HuntingHandler hunting)
    {
        this.hunting=hunting;
    }
    public void Find_Quarry()
    {
        hunting.Find_Quarry();
    }
    public void Detected_Quarry()
    {
        hunting.Detected_Quarry();
    }
    public void attack()
    {
        hunting.attack();
    }
    public void hunt()
    {
        Find_Quarry();
        Detected_Quarry();
        attack();
    }
}
