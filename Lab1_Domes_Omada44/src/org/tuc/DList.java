package org.tuc;

public class DList implements List {

    private Node head;
    private Node tail;
    private Node current = null;



    @Override
    public boolean insert(int key,String data) {
        /** Creates a new element with key, data */
        Element newElement = new DListElement(key, data);

        /** Creates a new Node with newElement */
        Node newNode = new DListNode(newElement);

        /** If List is empty set new Node as head and tail*/
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            /** Inserts Node to the end of the List*/
            tail.setNext(newNode);        /** Links tail to newNode*/
            newNode.setPrev(tail);        /** Links newNode to tail, WE MUST DO THIS IN DLIST, OTHERWISE prev pointer = null!*/
            tail = newNode;             /** Update tail with newNode*/
        }

        return true;                    /**Inserted successfully*/
    }

        /**DEEPSEEK CODE, REVIEW AND CONTINUE*/
         @Override
         public boolean delete(int key) {

         if(head == null) {
             return false;  /** If List is empty return false*/
         }
         Node current = head;

         while (current != null) {
         if (current.getElement().getKey() == key) {
         // Adjust the previous node's next pointer
         if (current.getPrev() != null) {
         current.getPrev().setNext(current.getNext());
         } else {
         head = current.getNext();
         }

         // Adjust the next node's previous pointer
         if (current.getNext() != null) {
         current.getNext().setPrev(current.getPrev());
         } else {
         tail = current.getPrev();
         }

         // Return true to indicate successful deletion
         return true;
         }
         current = current.getNext();
         }

         // Return false if the key was not found
         return false;
         }

         @Override
         public Element search(int key) {
         Node current = head;

         while (current != null) {
         if (current.getElement().getKey() == key) {
         // Return the Element if the key matches
         return current.getElement();
         }
         current = current.getNext();
         }

         // Return null if the key was not found
         return null;
         }


}
