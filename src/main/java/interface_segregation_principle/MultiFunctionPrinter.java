package interface_segregation_principle;

public class MultiFunctionPrinter implements Machine {
    @Override
    public void print(Document d) {
        System.out.println("Printing... "+d.getText());
    }

    @Override
    public void fax(Document d) {
        System.out.println("Faxing...");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Scanning...");
    }
}
