package liskov_substitution_principle;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(int size) {
        width = height = size;
    }

    /**
     * At this point Liskov Substitution Principle was broken
     * @param width
     */
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
