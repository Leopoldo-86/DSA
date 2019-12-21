package com.company;

public class Node {

    private Person person;
    private Node next;
    private Node prev;


    public Node(Person person) {
        this.person = person;

    }

    public Node() {

    }

    public Person getData() {

        return person;
    }

    public void setData(Person person) {

        this.person = person;
    }

    public Node getNext() {

        return next;
    }

    public void setNext(Node next) {

        this.next = next;
    }

    public Node getPrev() {

        return prev;
    }

    public void setPrev(Node prev) {

        this.prev = prev;
    }

}