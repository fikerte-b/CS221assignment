package assignment7;


public class CustomerQueue<E> implements MyQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E>{

        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }


    @Override
    public boolean offer(E e) {
        Node<E> newNode = new Node<>(e);
        if(head == null){
            tail = newNode;
            head = tail;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
        return true;
    }


    @Override
    public E poll() {
        if(size ==0){
            return null;
        }
        E hand = head.data;
        head = head.next;
        size--;
        return hand;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String toString() {
        Node<E> current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }

}
