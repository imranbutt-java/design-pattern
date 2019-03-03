package interface_segregation_principle;

import interface_segregation_principle.better_solution.Photocopier;

/**
 * Interface Segregation Principle:
 * The interface-segregation principle (ISP) states that no client should be forced to depend on
 * methods it does not use. ... ISP splits interfaces that are very large into smaller and more
 * specific ones so that clients will only have to know about the methods that are of interest to them.
 */
public class ISPMain {

    public static void main(String[] args) {
        OldFashionedPrinter oldFashionedPrinter = new OldFashionedPrinter();
        Document d = new Document("Text from Doc");
        oldFashionedPrinter.print(d);
        System.out.println("Even OldFashionedPrinter don't have fax, scan methods but asked to implement.");
        oldFashionedPrinter.fax(d);

        System.out.println("\nAfter Interface Segregation\n");
        Photocopier pc = new Photocopier();
        pc.print(d);
        pc.scan(d);
        System.out.println("Well, it has no fax functionality and it never implemented that method");
    }
}
