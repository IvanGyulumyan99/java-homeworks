package set.interfaces;

/**
 * Interface that has the following methods.
 *
 * @param <E>
 */
public interface MyTreeSetInterface<E> {
    /**
     * adds element to TreeSet
     *
     * @param elem
     * @return true if adding passed correctly and false otherwise
     */
    boolean add(E elem);

    /**
     * deletes elements from TreeSet
     *
     * @param elem
     * @return true if removing passed correctly and false otherwise
     */
    boolean remove(E elem);

    /**
     * cheks if the given element contains in TreeSet
     *
     * @param elem
     * @return true if element contains in TreeSet and false otherwise
     */
    boolean contains(E elem);

    /**
     * method that returns size
     *
     * @return size
     */
    int size();
}
