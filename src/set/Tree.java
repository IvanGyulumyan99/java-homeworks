package set;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Tree<E> {
    private Leaf<E> root;
    private List<E> list;
    private int size;

    public Tree() {
        list = new LinkedList<>();
        root = new Leaf<>(null);
    }

    public boolean add(E e) {
        if (size == 0) {
            return initRootLeaf(e);
        }
        Leaf<E> newNode = new Leaf<>(e);
        Leaf<E> lastNode = findLastLeaf(root, newNode);

        if (lastNode == null || e == null) {
            return false;
        }
        size++;
        newNode.parent = lastNode;
        if (lastNode.compareTo(newNode) < 0) {
            lastNode.right = newNode;
            return true;
        } else {
            lastNode.left = newNode;
            return true;
        }
    }

    private Leaf<E> findLastLeaf(Leaf<E> oldLeaf, Leaf<E> newLeaf)  {
        Leaf<E> lastLeaf = oldLeaf;
        int compare = oldLeaf.compareTo(newLeaf);
        if (compare < 0 && oldLeaf.right != null) {
            lastLeaf = findLastLeaf(oldLeaf.right, newLeaf);
            return lastLeaf;
        }
        if (compare > 0 && oldLeaf.left != null) {
            lastLeaf = findLastLeaf(oldLeaf.left, newLeaf);
            return lastLeaf;
        }
        if (compare == 0) {
            return null;
        }
        return lastLeaf;
    }

    private boolean initRootLeaf(E e) {
        root.elem = e;
        size++;
        return true;
    }

    public int size(){
        return size;
    }

    public boolean contains(E e){
        Leaf<E> elem = new Leaf<>(e);
        return search(root, elem) != null;
    }

    public Leaf<E> search(Leaf<E> firstLeaf, Leaf<E> secondLeaf){
        int compare = firstLeaf.compareTo(secondLeaf);
        if (compare < 0 && firstLeaf.right != null) {
            return search(firstLeaf.right, secondLeaf);
        }
        if (compare > 0 && firstLeaf.left != null) {
            return search(firstLeaf.left, secondLeaf);
        }
        if (compare == 0) {
            return firstLeaf;
        }
        return null;
    }



    class Leaf<E> implements Comparable<E> {
        private Leaf<E> parent;
        private Leaf<E> right;
        private Leaf<E> left;
        private E elem;

        Leaf(E elem) {
            this.elem = elem;
        }

        public E getElem() {
            return elem;
        }

        @Override
        public int compareTo(Object obj) {
            Leaf<E> node = (Leaf<E>) obj;
            return this.hashCode() - node.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Leaf<?> leaf = (Leaf<?>) o;
            return Objects.equals(parent, leaf.parent) &&
                    Objects.equals(right, leaf.right) &&
                    Objects.equals(left, leaf.left) &&
                    Objects.equals(elem, leaf.elem);
        }

        @Override
        public int hashCode() {
            return Objects.hash(elem);
        }
    }
}
