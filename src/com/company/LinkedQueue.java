package com.company;

public class LinkedQueue<E> {

    private Node head;
    private Node tail;
    public int size;
    private Node lastHigh;
    private Node lastMedium;


    //CONSTRUCTOR
    public LinkedQueue(){
        this.size = 0;
        this.head = null;
        this.tail = null;

    }
    // People leaving the queue
    public void dequeue(){

        head = head.getNext();
        size--;
        head.setPrev(null);

    }
    // People getting the queue
    public void enqueue(Person p){

        Node node = new Node();
        node.setData(p);
        if(size == 0){
            head = node;
            size++;
            tail = node;

        }else{
            node.setPrev(tail);
            tail = node;
            size++;
            tail.setNext(null);

        }

    }

    public void addHigh(Node node) {
        Node temp;
        if(isEmpty()){
            head = node;
            tail = node;

        }else{
            temp = head;


            //if(node != null){
            //temp = node;

            //}

            while(temp.getNext().getData().getPriorityLevel().equals("High") || temp.getNext() != null){

            }
            node.setPrev(temp);
            temp.setNext(node);
        }
        tail.setNext(node);
        node.setPrev(tail);
        tail = node;

    }

    /**
     * return whether the list empty or not
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * returns the size if the linked queue
     * @return
     */
    public int size(){
        return  size;
    }

    public void addMedium(Node node){

    }

    /**
     * adds node at the end of the linked list
     * @param node
     */
    public void addLow(Node node){
        Node temp;
        if(size == 0){
            head = node;
            tail = node;
            size ++;
            System.out.println("adding: " + node.getData().getFirstName());
        }else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            System.out.println("adding: " + node.getData().getFirstName());
        }


    }

    public Node getHead() {
        return head;
    }

    public void addPerson(Person p) {
        Node node = new Node(p);
        if(p.getPriorityLevel().equals("Low")) {
            addLow(node);
        }
    }
    //---------------------------
    public void getQueue() {
        Node node = head;
        do{
            System.out.println(node.getData().getFirstName() + " " + node.getData().getLastName());
            node = node.getNext();
        }while(node != null);
    }
}