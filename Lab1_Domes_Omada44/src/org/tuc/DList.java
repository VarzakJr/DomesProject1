package org.tuc;

public class DList implements List {

    private Node head;
    private Node tail;
    private Node current;

    private class Node {
        Node next;
        Node prev;
        Element element;


    public Node(Element element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}
    public DList() {
        head = null;
        tail = null;
    }

    @Override
    public boolean insert(int key,String data) {
        /** Creates a new element with key, data */
        Element newElement = new DlistElement(key,data);

        /** Creates a new Node with newElement */
        Node newNode = new DListNode(newElement);

        /** If List is empty set new Node as head and tail*/
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            /** Inserts Node to the end of the List*/
            tail.next = newNode;        /** Links tail to newNode*/
            newNode.prev = tail;        /** Links newNode to tail, WE MUST DO THIS IN DLIST, OTHERWISE prev pointer = null!*/
            tail = newNode;             /** Update tail with newNode*/
        }

        return true;                    /**Inserted successfully*/
    }

        /**DEEPSEEK CODE, REVIEW AND CONTINUE*/
         @Override
         public boolean delete(int key) {
         Node current = head;

         while (current != null) {
         if (current.element.getKey() == key) {
         // Adjust the previous node's next pointer
         if (current.prev != null) {
         current.prev.next = current.next;
         } else {
         head = current.next;
         }

         // Adjust the next node's previous pointer
         if (current.next != null) {
         current.next.prev = current.prev;
         } else {
         tail = current.prev;
         }

         // Return true to indicate successful deletion
         return true;
         }
         current = current.next;
         }

         // Return false if the key was not found
         return false;
         }

         @Override
         public Element search(int key) {
         Node current = head;

         while (current != null) {
         if (current.element.getKey() == key) {
         // Return the Element if the key matches
         return current.element;
         }
         current = current.next;
         }

         // Return null if the key was not found
         return null;
         }


}
