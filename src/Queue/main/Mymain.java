package Queue.main;

import Queue.implementation.MyQueue;

public class Mymain {

    public static void main(String[] args){
        MyQueue<String> Queue = new MyQueue<>();
        Queue.enqueue("Lord Ram");
        Queue.enqueue("was");
        Queue.enqueue("the");
        Queue.enqueue("son");
        Queue.enqueue("of");
        Queue.enqueue("Raja Dashrath");


        Queue.traverse();
        System.out.println("After Deleting element");
        System.out.println(Queue.dequeue());
        System.out.println(Queue.peek());


        System.out.println("After traversing");
        Queue.traverse();

    }
}
