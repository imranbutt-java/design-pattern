package open_close_principle.better_solution;

import open_close_principle.Color;
import open_close_principle.Product;

public class ColorSpecification implements Specification<Product> {
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == this.color;
    }
}
