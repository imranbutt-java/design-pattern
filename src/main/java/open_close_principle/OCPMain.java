package open_close_principle;

import open_close_principle.better_solution.AndSpecification;
import open_close_principle.better_solution.BetterFilter;
import open_close_principle.better_solution.ColorSpecification;
import open_close_principle.better_solution.SizeSpecification;

import java.util.Arrays;
import java.util.List;

/**
 * Suppose we get some requirement to make Product Filter by color so we made the below filter
 * and then we get some further requirement to filter on some other parameter and so on. Thus, our code
 * which might be already tested would be modified with new requirements and we are violating
 * Open for Extension and Closed for Modification Rule.
 * So we can better build using specification problem. That is why 2 interfaces were added
 * Specification and Filter.
 * So instead of Color, Size, Price etc specific filter we came up with generic solution
 */
public class OCPMain {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple, tree, house);
        ProductFilter pf = new ProductFilter();
        System.out.println("Green Products: OLD");
        pf.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p));
        System.out.println("\n#########\n");
        BetterFilter bf = new BetterFilter();
        System.out.println("Green Products: New");
        bf.filter(products, new ColorSpecification(Color.GREEN)).forEach(p -> System.out.println(p));
        System.out.println("Large Products: New");
        bf.filter(products, new SizeSpecification(Size.SMALL)).forEach(p -> System.out.println(p));
        System.out.println("Blue and Large Product: New");
        bf.filter(products,
                new AndSpecification( Arrays.asList(new ColorSpecification(Color.BLUE),
                                                    new SizeSpecification(Size.LARGE) )))
                .forEach(p -> System.out.println(p));
    }
}
