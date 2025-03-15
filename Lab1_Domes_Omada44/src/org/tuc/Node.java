package org.tuc;

public interface Node {
    // Get the element stored in the node
    Element getElement();

    // Get the previous node
    Node getPrev();

    // Set the previous node
    void setPrev(Node prev);

    // Get the next node
    Node getNext();

    // Set the next node
    void setNext(Node next);
}