package open_close_principle.better_solution;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
