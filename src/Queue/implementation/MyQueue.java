package Queue.implementation;

import Queue.myInterface.QueueADT;

public class MyQueue<E> implements QueueADT<E> {

    private Node<E> front;    //head
    private Node<E> rear;     //tail
    private int size;


    @Override
    public void enqueue(E element) {
        Node<E> node = new Node<>(element);
        if(!isEmpty()){
            rear.setNext(node);
            rear = node;
        }
        else{
            front = node;
            rear = node;
        }
        size++;
    }

    @Override
    public E dequeue() {
        E response =null;
        if(!isEmpty()){
            response = front.getData();
            front = front.getNext();
        }
        size --;
        return response;
    }

    @Override
    public E peek() {
        E response = null;
        if(!isEmpty()){
            response = front.getData();
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return front==null;  //size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void traverse(){
        Node<E> temp = front;
        //System.out.println(temp.getData()+" ");
        while(temp.getNext()!=null){
            System.out.println(temp.getData()+" ");
            temp=temp.getNext();
        }
        System.out.println(rear);
    }
}
