package com.pushkar.LinkedLists;

public class Node {
    private int info;

    private Node link;

    Node(int info) {
        this.info = info;
        this.link = null;
    }

    public Node(int info, Node link) {
        this.info = info;
        this.link = link;
    }

    public int getInfo() {
        return info;
    }

    public Node getLink() {
        return link;
    }

    void setLink(Node link) {
        this.link = link;
    }
}
