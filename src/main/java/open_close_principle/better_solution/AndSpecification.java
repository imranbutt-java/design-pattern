package open_close_principle.better_solution;

import open_close_principle.Product;

import java.util.List;

public class AndSpecification implements Specification<Product> {
    private List<Specification> specs;

    public AndSpecification(List<Specification> specs) {
        this.specs = specs;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return specs.stream().allMatch(s -> s.isSatisfied(item));
    }
}
