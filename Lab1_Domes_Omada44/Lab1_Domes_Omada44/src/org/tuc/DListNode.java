package org.tuc;

public class DListNode implements Node {
    private Element element;  // The data stored in the node
    private Node prev;       // Reference to the previous node
    private Node next;       // Reference to the next node

    // Constructor to initialize the node with an element
    public DListNode(Element element) {
        this.element = element;
        this.prev = null;
        this.next = null;
    }

    // Get the element stored in the node
    @Override
    public Element getElement() {
        return element;
    }

    // Get the previous node
    @Override
    public Node getPrev() {
        return prev;
    }

    // Set the previous node
    @Override
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    // Get the next node
    @Override
    public Node getNext() {
        return next;
    }

    // Set the next node
    @Override
    public void setNext(Node next) {
        this.next = next;
    }
}