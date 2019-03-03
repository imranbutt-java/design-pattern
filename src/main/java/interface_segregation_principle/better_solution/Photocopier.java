package interface_segregation_principle.better_solution;

import interface_segregation_principle.Document;

public class Photocopier implements Printer, Scanner {

    @Override
    public void print(Document d) {
        System.out.println("Photocopier printing... "+d.getText());
    }

    @Override
    public void scan(Document d) {
        System.out.println("Photocopier scanning... "+d.getText());
    }
}
