package ejercicio3;

import actividad1.ExceptionIsEmpty;
import actividad3.PriorityQueue;
import actividad2.Queue;
import actividad2.QueueLink;

public class PriorityQueueLinked<E> implements PriorityQueue<E, Integer> {

    private Queue<E>[] colas;

    @SuppressWarnings("unchecked")
    public PriorityQueueLinked(int niveles) {
        colas = new Queue[niveles];
        for (int i = 0; i < niveles; i++) {
            colas[i] = new QueueLink<>();
        }
    }

    public void enqueue(E x, Integer prioridad) {
        if (prioridad < 0 || prioridad >= colas.length)
            throw new IllegalArgumentException("Prioridad inválida");
        colas[prioridad].enqueue(x);
    }

    public E dequeue() throws ExceptionIsEmpty {
        for (int i = colas.length - 1; i >= 0; i--) {
            if (!colas[i].isEmpty()) {
                return colas[i].dequeue();
            }
        }
        throw new ExceptionIsEmpty("Cola vacía");
    }

    public E front() throws ExceptionIsEmpty {
        for (int i = colas.length - 1; i >= 0; i--) {
            if (!colas[i].isEmpty()) {
                return colas[i].front();
            }
        }
        throw new ExceptionIsEmpty("Cola vacía");
    }

    public E back() throws ExceptionIsEmpty {
        for (int i = 0; i < colas.length; i++) {
            if (!colas[i].isEmpty()) {
                return colas[i].back();
            }
        }
        throw new ExceptionIsEmpty("Cola vacía");
    }

    public boolean isEmpty() {
        for (Queue<E> cola : colas) {
            if (!cola.isEmpty()) return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColaPrioridad ->\n");
        for (int i = colas.length - 1; i >= 0; i--) {
            sb.append("Prioridad ").append(i).append(": ").append(colas[i]).append("\n");
        }
        return sb.toString();
    }
}
