package interface_segregation_principle;

public interface Machine {
    void print(Document d);
    void fax(Document d);
    void scan(Document d);
}
