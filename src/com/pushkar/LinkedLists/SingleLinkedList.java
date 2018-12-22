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
     * @param val is the value of the node
     * insertAtEnd inserts a node at the very end of the linked list
     * since we have to iterate through the entire linked list,
     * this operation is of the order of N (number of items already in the list)
     * This is denoted as O(N)
     */
    public void insertAtEnd(int val) {
        Node p;
        Node temp = new Node(val);

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
     * @param val is the value of the node
     * insertAtBeginning inserts a node at the beginning of the linked list
     * since the incoming node is made the new 'start' node,
     * any new node will be added almost immediately (you still have to move
     *          the current start node one space back)
     * this operation is of the order of 1 (doesn't matter how many items are already in the list)
     * This is denoted as O(1)
     */
    public void insertAtBeginning(int val) {

        Node temp = new Node(val);

        temp.setLink(start);
        start = temp;

    }

    /**
     * @param val is the value of the node
     * @param pos is the position after which the incoming node has to be inserted
     * insertAt inserts a node at the position 'pos' of the linked list
     * if the pos == 0, then it is same as inserting the node at the beginning of the list
     * otherwise we will need the reference to the node just before the position of the new node
     * which can be found by iterating over the list just before pos - 1
     * this operation is of the order of pos and is variable because of that.
     *            in worst case scenario, the operation tends to be order of n
     * This is denoted as theta(pos) or O(n)
     */
    public void insertAt(int val, int pos)
    {
        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }

        int i = 0;
        Node p = start;

        while(i < pos - 1 && p != null) {
            p = p.getLink();
            i++;
        }

        if(p != null) {
            Node temp = new Node(val);
            temp.setLink(p.getLink());
            p.setLink(temp);
        }
    }

    /**
     * @param val is the value of the node
     * findNode searches the value provided in the linked list
     * we will have to iterate over the entire list until we find the value val
     * this is same as finding a value in an unsorted array
     * This is denoted as O(n)
     */
    public Node findNode(int val) {
        Node p = start;

        while(p != null) {
            if (p.getInfo() == val)
                return p;

            p = p.getLink();
        }

        return null;
    }

    /**
     * @param val is the value of the node
     * findPosition searches the value provided in the linked list
     *            and returns the position of the node in the linked list
     * we will have to iterate over the entire list until we find the value val
     * this is same as finding a value in an unsorted array
     * This is denoted as O(n)
     */
    public int findPosition(int val) {
        Node p = start;
        int i = 0;

        while(p != null) {
            if (p.getInfo() == val)
                return i;

            p = p.getLink();
            i++;
        }

        return -1;
    }

}
