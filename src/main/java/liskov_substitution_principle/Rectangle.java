package liskov_substitution_principle;

public class Rectangle {
    protected int width, height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    // We can also add this instead of separate class
    public boolean isSquare() {
        return this.width == this.height;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
