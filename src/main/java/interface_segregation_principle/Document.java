package interface_segregation_principle;

public class Document {
    //Suppose it is text document
    private String text;
    public Document(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
