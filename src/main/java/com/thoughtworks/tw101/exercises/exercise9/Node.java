package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;
    //maybe not necessary...
    // private Node parent;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if(name.compareTo(nameOfNewNode) < 0) {
            if(right == null) {
                right = new Node(nameOfNewNode);
                System.out.println("inserted " + nameOfNewNode + " after " + name);
                return;
            }
            right.add(nameOfNewNode);
        }
        else {
            if(left == null) {
                left = new Node(nameOfNewNode);
                System.out.println("inserted " + nameOfNewNode + " before " + name);
                return;
            }
            left.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        return null;
    }
}
