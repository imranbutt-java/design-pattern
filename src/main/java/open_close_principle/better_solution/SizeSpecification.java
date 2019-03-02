package open_close_principle.better_solution;

import open_close_principle.Product;
import open_close_principle.Size;

public class SizeSpecification implements Specification<Product> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == this.size;
    }
}
