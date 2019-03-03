package interface_segregation_principle.better_solution;

import interface_segregation_principle.Document;

public class JustAPrinter implements Printer {
    @Override
    public void print(Document d) {
        System.out.println("Just a Printer");
    }
}
