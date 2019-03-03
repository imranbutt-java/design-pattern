package liskov_substitution_principle;

/**
 *
 * Liskov Substitution Principle:
 * The Liskov Substitution Principle (LSP, lsp) is a concept in Object Oriented Programming that states:
 * Functions that use pointers or references to base classes must be able to use objects of derived classes
 * without knowing it.
 *
 * Simply, you should be able to substitute derived class for a base class
 * The problem happens in Square setter function. That implementation is good w.r.t Square but violates
 * LSP for Rectangle.
 * Now question arises how to make Square class ?
 * We don't need that rather we just need a function sth like
 * boolean isSquare() {}
 * but if we really want separate constructors so we can go with factory pattern.
 */
public class LSPMain {
    public static void main(String[] args) {
        System.out.println("Working Fine");
        Rectangle r = new Rectangle(2, 3);
        useIt(r);

        System.out.println("Here the problem happened");
        Rectangle square = new Square();
        square.setWidth(5);
        useIt(square);
    }

    private static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);

        // Area = Width * 10
        System.out.println("Expected Area: "+(width * 10)+", but what we get Area: "+r.getArea());
    }
}
