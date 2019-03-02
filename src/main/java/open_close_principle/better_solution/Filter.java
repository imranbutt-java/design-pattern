package open_close_principle.better_solution;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    /**
     * So instead of Color, Size, Price etc specific filter we came up with generic solution
     * @param items
     * @param spec
     * @return
     */
    Stream<T> filter(List<T> items, Specification<T> spec);
}
