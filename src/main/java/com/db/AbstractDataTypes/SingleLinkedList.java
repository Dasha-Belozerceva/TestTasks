package com.db.AbstractDataTypes;
import java.util.LinkedList;

public class SingleLinkedList<T> {
    EntryList<T> first;

    private class EntryList<T>{
        T value;
        EntryList<T> next;

        public EntryList(T value){
            this.value = value;
        }

        public void printValue(){
            System.out.println(value);
        }
    }

    public SingleLinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void insertFirst(T value){
        EntryList<T> entryList = new EntryList<T>(value);
        entryList.next = first;
        first = entryList;
    }

    public void insertLast(T value){
        EntryList<T> entryList = new EntryList<T>(value);
        if(isEmpty()){
            first = entryList;
        }
        else{
            EntryList<T> current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = entryList;
        }
    }

    public EntryList<T> findElement(T value){
        EntryList<T> current = first;
        if(this.isEmpty()){
            System.out.println("list is empty");
            return null;
        }
        while(current.value != value){
           if (current.next == null){
               System.out.println("element had't found");
                return null;
            }
           else{
               current = current.next;
           }
        }
        System.out.println(current.value);
        return current;
    }


    public EntryList<T> deleteFirst(){
        if(isEmpty()){
            return null;
        }
        EntryList<T> temp = first;
        first = first.next;
        return temp;
    }

    public EntryList<T> deleteByValue(T value){
        EntryList<T> current = first;
        if (this.isEmpty()){
            return null;
        }
        if (current.value == value){
            current = this.deleteFirst();
        }
        if (current.next == null){
            return null;
        }
        while(current.next.value != value){
            current = current.next;
        }
        EntryList<T> deleted = current.next;
        current.next = current.next.next;
        return deleted;
    }

    public void printList(){
        EntryList<T> current = first;
        if (this.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        while (current != null){
            current.printValue();
            current = current.next;
        }
    }


}
