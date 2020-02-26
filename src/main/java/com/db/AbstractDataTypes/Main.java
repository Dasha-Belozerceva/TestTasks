package com.db.AbstractDataTypes;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        list.insertFirst(5);
        list.insertLast(6);
        list.insertFirst(3);
        list.insertLast(2);
        list.deleteFirst();
        list.deleteByValue(6);
        list.deleteByValue(2);
        list.findElement(5);
        //list.printList();
    }
}
