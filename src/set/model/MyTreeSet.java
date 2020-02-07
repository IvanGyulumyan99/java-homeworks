package set.model;

import set.interfaces.MyTreeSetInterface;

/**
 * The MyTreeSet class is a simple implementation of TreeSet which stores object in sorted order
 *
 * @param <E>
 * @author Ivan Gyulumyan
 * @version 1.0
 * @since 02-07-2020
 */

public class MyTreeSet<E extends Comparable<E>> implements MyTreeSetInterface<E> {

    private Node root;

    /**
     * this method calls private add method, add is divided on two parts because of it's recursive
     *
     * @param elem is element which we want to add in our Tree
     * @return true if object is added to the tree correctly and false otherwise
     */
    @Override
    public boolean add(E elem) {
        if (elem != null) {
            root = add(root, elem);
            return add(root, elem) != null;
        }
        return false;
    }

    /**
     * recursively adds element to its place like binary tree
     *
     * @param root is our root element which changes recursively while the element is not added
     * @param elem is the element which we want to add
     * @return
     */
    private Node add(Node root, E elem) {
        if (elem.equals(root)) {
            return null;
        }
        if (root == null) {
            return new Node(elem);
        } else if (elem.compareTo(root.elem) < 0) {
            root.left = add(root.left, elem);
        } else if (elem.compareTo(root.elem) > 0) {
            root.right = add(root.right, elem);
        } else {
            return root;
        }
        return root;
    }

    /**
     * this method calls private remove method
     *
     * @param elem element which we want to delete
     * @return true if removed correctly and false otherwise
     */
    @Override
    public boolean remove(E elem) {
        if (elem != null) {
            root = remove(root, elem);
            return remove(root, elem) != null;
        }
        return false;
    }

    /**
     * method which deletes element from our TreeSet
     *
     * @param root its our root element which changes recursively.
     * @param elem element which we want to delete
     * @return
     */
    private Node remove(Node root, E elem) {
        if (root == null) {
            return null;
        } else if (elem.compareTo(root.elem) < 0) {
            root.left = remove(root.left, elem);
        } else if (elem.compareTo(root.elem) > 0) {
            root.right = remove(root.right, elem);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
        }
        return root;
    }

    /**
     * calls private method which finds the element
     *
     * @param elem element which we want to check
     * @return true if tree contains elem and false otherwise
     */
    @Override
    public boolean contains(E elem) {
        if (elem == null) {
            return false;
        }
        return contains(root, elem);
    }

    /**
     * this method checks if tree contains element
     *
     * @param root
     * @param elem element which we wants to check
     * @return
     */
    private boolean contains(Node root, E elem) {
        if (root == null) {
            return false;
        } else if (elem.compareTo(root.elem) < 0) {
            return contains(root.left, elem);
        } else if (elem.compareTo(root.elem) > 0) {
            return contains(root.right, elem);
        } else {
            return true;
        }
    }

    /**
     * @return size of tree
     */
    @Override
    public int size() {
        return (size(root));
    }

    /**
     * this method return size of tree
     *
     * @param node
     * @return size
     */
    private int size(Node node) {
        if (node == null) {
            return (0);
        } else {
            return (size(node.left) + 1 + size(node.right));
        }
    }

    /**
     * prints our tree in sorted order
     */
    public void print() {
        System.out.println("TreeSet: ");
        print(root);
        System.out.println();
    }

    private void print(Node root) {
        if (root != null) {
            print(root.left);
            System.out.println(root.elem);
            print(root.right);
        }
    }

    private class Node {
        E elem;
        Node left;
        Node right;

        Node(E elem) {
            this.elem = elem;
        }
    }

}
