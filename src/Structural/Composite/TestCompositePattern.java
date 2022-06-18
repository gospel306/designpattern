package Structural.Composite;

public class TestCompositePattern {
    public static void main(String[] args) {
        //Initialize four ellipses
        Eclipse ellipse1 = new Eclipse();
        Eclipse ellipse2 = new Eclipse();
        Eclipse ellipse3 = new Eclipse();
        Eclipse ellipse4 = new Eclipse();

        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Composes the graphics
        graphic1.add(ellipse1); // children - leaf
        graphic1.add(ellipse2); // children - leaf
        graphic1.add(ellipse3); // children - leaf

        graphic2.add(ellipse4); // children - leaf

        graphic.add(graphic1); // children - composite
        graphic.add(graphic2); // children - composite

        //Prints the complete graphic (Four times the string "Eclipse").
        graphic.print();
    }
}
