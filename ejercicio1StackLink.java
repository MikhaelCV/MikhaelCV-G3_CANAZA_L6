package ejercicio1;

import actividad1.ExceptionIsEmpty;
import actividad1.Stack;

public class StackLink<E> implements Stack<E> {
    private Node<E> top;

    public StackLink() {
        this.top = null;
    }

    public void push(E x) {
        top = new Node<>(x, top);
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Pila vacía");
        E data = top.getData();
        top = top.getNext();
        return data;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Pila vacía");
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Tope -> ");
        Node<E> current = top;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }
}
