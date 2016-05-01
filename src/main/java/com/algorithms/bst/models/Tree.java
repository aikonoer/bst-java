package com.algorithms.bst.models;

/**
 * Created by brianmomongan on 1/05/16.
 */
public class Tree<T extends Comparable<T>> {

    private Vertex<T> root;

    public Vertex<T> getRoot() {
        return root;
    }

    public void insertNode(T data) {
        root = insertNode(root, data);
    }

    private Vertex<T> insertNode(Vertex<T> current, T data) {
        if (current == null) return new Vertex<>(data);
        else {
            if (current.compareTo(data) >= 0) {
                current.setLeft(insertNode(current.getLeft(), data));
                return current;
            } else {
                current.setRight(insertNode(current.getRight(), data));
                return current;
            }
        }
    }

}