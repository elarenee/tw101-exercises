package com.thoughtworks.tw101.exercises.exercise9;

import java.util.*;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if(name.compareTo(nameOfNewNode) < 0) {
            if(right == null) {
                right = new Node(nameOfNewNode);
                //System.out.println("inserted " + nameOfNewNode + " after " + name);
                return;
            }
            right.add(nameOfNewNode);
        }
        else {
            if(left == null) {
                left = new Node(nameOfNewNode);
                //System.out.println("inserted " + nameOfNewNode + " before " + name);
                return;
            }
            left.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        //System.out.println(this.name + " " + this.right.name + " " + this.right.right.name+ " " + this.right.right.right.name);
        //return null;
        ArrayList nameList = namesHelper(new ArrayList<String>(), this.left);
        return namesHelper(nameList, this.right);
    }

    private ArrayList<String> namesHelper(ArrayList<String> nameList, Node node) {
        if(node.left != null) {
            return namesHelper(nameList, node.left);
        }
        else {
            nameList.add(node.name);
            if(node.right != null) {
                return namesHelper(nameList, node.right);
            }
            else {
                return nameList;
            }
        }



        //System.out.println("Should never get here!");
        //return null;
    }
}
