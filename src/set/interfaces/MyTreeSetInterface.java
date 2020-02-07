package set.interfaces;

/**
 * Interface that has the following methods.
 *
 * @param <E>
 */
public interface MyTreeSetInterface<E> {
    boolean add(E elem);

    boolean remove(E elem);

    boolean contains(E elem);

    int size();
}
