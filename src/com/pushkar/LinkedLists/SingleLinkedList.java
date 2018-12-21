package com.pushkar.LinkedLists;

public class SingleLinkedList {

    private Node start;

    public SingleLinkedList() {
        start = null;
    }

    public Node getStart() {
        return start;
    }


    /**
     * @param n is the value of the node
     * insertAtEnd inserts a node at the very end of the linked list
     * since we have to iterate through the entire linked list,
     * this operation is of the order of N (number of items already in the list)
     * This is denoted as O(N)
     */
    public void insertAtEnd(int n) {
        Node p;
        Node temp = new Node(n);

        if (start == null) {
            start = temp;
            return;
        }

        p = start;

        while(p.getLink() != null) {
            p = p.getLink();
        }

        p.setLink(temp);

    }

    /**
     * @param n is the value of the node
     * insertAtBeginning inserts a node at the beginning of the linked list
     * since the incoming node is made the new 'start' node,
     * any new node will be added almost immediately (you still have to move
     *          the current start node one space back)
     * this operation is of the order of 1 (doesn't matter how many items are already in the list)
     * This is denoted as O(1)
     */
    public void insertAtBeginning(int n) {

        Node temp = new Node(n);

        temp.setLink(start);
        start = temp;

    }

    public void insertAt(int n, int pos)
    {
        if (pos == 0) {
            insertAtBeginning(n);
            return;
        }

        int i = 0;
        Node p = start;

        while(i < pos - 1 && p != null) {
            p = p.getLink();
            i++;
        }

        if(p != null) {
            Node temp = new Node(n);
            temp.setLink(p.getLink());
            p.setLink(temp);
        }
    }

}
