package set.interfaces;

/**
 * Interface that has the following methods.
 *
 * @param <E> this parameter must be an object with implemented Comparator and compareTo method
 */
public interface MyTreeSetInterface<E> {
    /**
     * adds element to TreeSet
     *
     * @param elem object we want to add to our TreeSet
     * @return true if adding passed correctly and false otherwise
     */
    boolean add(E elem);

    /**
     * deletes elements from TreeSet
     *
     * @param elem object we want to delete from our TreeSet
     * @return true if removing passed correctly and false otherwise
     */
    boolean remove(E elem);

    /**
     * checks if the given element contains in TreeSet
     *
     * @param elem element we want to remove from out TreeSet
     * @return true if element contains in TreeSet and false otherwise
     */
    boolean contains(E elem);

    /**
     * method that returns size of our TreeSet
     *
     * @return size
     */
    int size();
}
