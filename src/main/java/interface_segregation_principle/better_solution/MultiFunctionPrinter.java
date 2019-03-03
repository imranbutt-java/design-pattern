package interface_segregation_principle.better_solution;

import interface_segregation_principle.Document;

public class MultiFunctionPrinter implements MultiFunctionMachine {
    @Override
    public void print(Document d) {
        System.out.println("MultiFunctionPrinter printing...");
    }

    @Override
    public void scan(Document d) {
        System.out.println("MultiFunctionPrinter scanning...");
    }

    @Override
    public void fax(Document d) {
        System.out.println("MultiFunctionPrinter faxing...");
    }
}
