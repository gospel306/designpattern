package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{
    private List<Graphic> childGraphics = new ArrayList<>();

    public void print(){
        for(Graphic graphic: childGraphics){
            graphic.print();
        }
    }

    public void add(Graphic graphic){
        this.childGraphics.add(graphic);
    }

    public void remove(Graphic graphic){
        childGraphics.remove(graphic);
    }
}
