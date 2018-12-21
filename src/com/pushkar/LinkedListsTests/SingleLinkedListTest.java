package com.pushkar.LinkedListsTests;

import com.pushkar.LinkedLists.SingleLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SingleLinkedListTest {

    @org.junit.jupiter.api.Test
    void insertAtEndWithEmptyList() {
        // arrange
        var linkedlist = new SingleLinkedList();

        // act
        linkedlist.insertAtEnd(5);

        // asssert
        assertNotNull(linkedlist);
        assertEquals(5, linkedlist.getStart().getInfo());
    }

    @org.junit.jupiter.api.Test
    void insertAtEndWithNonEmptyList() {
        // arrange
        var linkedlist = new SingleLinkedList();

        // act
        linkedlist.insertAtEnd(5);
        linkedlist.insertAtEnd(10);
        linkedlist.insertAtEnd(15);

        // asssert
        assertNotNull(linkedlist);
        assertEquals(10, linkedlist.getStart().getLink().getInfo());
        assertEquals(15, linkedlist.getStart().getLink().getLink().getInfo());
    }

    @org.junit.jupiter.api.Test
    void insertAtBeginningWithEmptyList() {
        // arrange
        var linkedlist = new SingleLinkedList();

        // act
        linkedlist.insertAtBeginning(5);

        // asssert
        assertNotNull(linkedlist);
        assertEquals(5, linkedlist.getStart().getInfo());
    }

    @org.junit.jupiter.api.Test
    void insertAtBeginningWithNonEmptyList() {
        // arrange
        var linkedlist = new SingleLinkedList();

        // act
        linkedlist.insertAtBeginning(5);
        linkedlist.insertAtBeginning(10);
        linkedlist.insertAtBeginning(15);

        // asssert
        assertNotNull(linkedlist);
        assertEquals(15, linkedlist.getStart().getInfo());
        assertEquals(10, linkedlist.getStart().getLink().getInfo());
        assertEquals(5, linkedlist.getStart().getLink().getLink().getInfo());
    }

    @org.junit.jupiter.api.Test
    void insertAtWithEmptyList() {
        // arrange
        var linkedlist = new SingleLinkedList();

        // act
        linkedlist.insertAt(5, 0);

        // asssert
        assertNotNull(linkedlist);
        assertEquals(5, linkedlist.getStart().getInfo());
    }

    @org.junit.jupiter.api.Test
    void insertAtWithNonEmptyList() {
        // arrange
        var linkedlist = new SingleLinkedList();
        // act
        linkedlist.insertAtBeginning(5); // 4
        linkedlist.insertAtBeginning(10); // 3
        linkedlist.insertAtBeginning(15); // 2
        linkedlist.insertAtBeginning(20); // 1
        linkedlist.insertAtBeginning(25); // 0


        // act
        linkedlist.insertAt(1000, 1);
        linkedlist.insertAt(200, 5);

        // asssert
        assertNotNull(linkedlist);
        assertEquals(1000, linkedlist.getStart().getLink().getInfo());
        assertEquals(200, linkedlist.getStart().getLink().getLink().getLink().getLink().getLink().getInfo());
    }
}