package actividad2;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first, last;

    public QueueLink() {
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x) {
        Node<E> newNode = new Node<>(x);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");
        E data = first.getData();
        first = first.getNext();
        if (first == null) last = null;
        return data;
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");
        return first.getData();
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");
        return last.getData();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Frente -> ");
        Node<E> current = first;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }
}
