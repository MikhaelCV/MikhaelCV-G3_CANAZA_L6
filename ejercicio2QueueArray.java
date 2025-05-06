package ejercicio2;

import actividad1.ExceptionIsEmpty;
import actividad2.Queue;

public class QueueArray<E> implements Queue<E> {
    private E[] array;
    private int front, rear, size;

    @SuppressWarnings("unchecked")
    public QueueArray(int capacidad) {
        array = (E[]) new Object[capacidad];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(E x) {
        if (size == array.length) throw new RuntimeException("Cola llena");
        rear = (rear + 1) % array.length;
        array[rear] = x;
        size++;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");
        E data = array[front];
        front = (front + 1) % array.length;
        size--;
        return data;
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");
        return array[front];
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) throw new ExceptionIsEmpty("Cola vacía");
        return array[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Frente -> ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % array.length;
            sb.append(array[index]).append(" ");
        }
        return sb.toString();
    }
}
