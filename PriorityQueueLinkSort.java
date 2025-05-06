package actividad3;

public class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> {

    class EntryNode {
        E data;
        N priority;

        EntryNode(E data, N priority) {
            this.data = data;
            this.priority = priority;
        }

        public String toString() {
            return data + " (p:" + priority + ")";
        }
    }

    private Node<EntryNode> first;

    public PriorityQueueLinkSort() {
        this.first = null;
    }

    public void enqueue(E x, N pr) {
        EntryNode entry = new EntryNode(x, pr);
        Node<EntryNode> newNode = new Node<>(entry);

        if (first == null || pr.compareTo(first.getData().priority) > 0) {
            newNode.setNext(first);
            first = newNode;
        } else {
            Node<EntryNode> current = first;
            while (current.getNext() != null &&
                   pr.compareTo(current.getNext().getData().priority) <= 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola de prioridad vacía");
        E result = first.getData().data;
        first = first.getNext();
        return result;
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");
        return first.getData().data;
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");
        Node<EntryNode> current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData().data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColaPrioridad -> ");
        Node<EntryNode> current = first;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }
}
