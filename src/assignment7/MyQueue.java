package assignment7;

public interface MyQueue<E> {

    boolean offer(E e);

    E poll();

    int getSize();
}
