package edu.escuelaing.arsw;

public class LinkedListNode<E> {
    private E value;
    private LinkedListNode<E> next;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public LinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }



    public LinkedListNode(E e) {
        value = e;
        next=null;
    }
}
