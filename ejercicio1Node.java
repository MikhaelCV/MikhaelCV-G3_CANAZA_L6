package ejercicio1;

public class Node<E> {
    private E data;
    private Node<E> next;

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() { return data; }
    public Node<E> getNext() { return next; }
}
