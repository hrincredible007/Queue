package Queue.myInterface;

public interface QueueADT<E> {

    void enqueue(E element);
    E dequeue();
    E peek();
    boolean isEmpty();
    int size();
}
