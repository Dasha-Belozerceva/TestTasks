package com.db.AbstractDataTypes;

public class DoublyLinkedList<T> {
    private EntryList<T> first;
    private EntryList<T> last;

    private class EntryList<T>{
        private T value;
        private EntryList<T> next;
        private EntryList<T> prev;

        public EntryList(T value){
            this.value = value;
        }

        public void printEntry(EntryList<T> entryList){
            System.out.println(entryList.value);
        }
    }

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void insertFirst(T value){
        EntryList<T> temp = first;
        first.value = value;
        first.next = temp;
        temp.prev = first;
        first.prev = last;
    }
    public void insertLast(T value){
        EntryList<T> temp = last;
        last.value = value;
        last.prev = temp;
        temp.next = last;
        last.next = first;
    }

    public EntryList<T> deleteFirst(){
        if(this.isEmpty()){
            return null;
        }
        EntryList<T> temp = first;
        first = first.next;
        last.next = first;
        first.prev = last;
        return temp;
    }


}
