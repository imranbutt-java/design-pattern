package interface_segregation_principle;

/**
 * Now Old Fashioned Printer has only functionality of printing but no scanning and faxing.
 * but when it implements Machine it has to override fax and scan which is confusing.
 * Lets say we throw some special exception like NoFaxImplementation,
 * here comes the problem ->
 * We need to make change in fax and scan function and also make that change in Machine, suppose Machine
 * interface was accessible to us
 *
 * YAGNI: You Ain't Going to Need It
 * means you should not implement function that you don't need
 * We would see Decorator that helps in it also
 */
public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document d) {
        System.out.println("OldFashionedPrinter: Printing... "+d.getText());
    }

    @Override
    public void fax(Document d) {
//        throw new Exception()
        System.out.println("OldFashionedPrinter: Sorry, I can't fax");
    }

    @Override
    public void scan(Document d) {

    }
}
