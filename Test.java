import actividad1.*;
import actividad2.*;
import actividad3.*;

import ejercicio1.*;
import ejercicio2.*;
import ejercicio3.*;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("=== Actividad 1: StackArray ===");
            Stack<String> pila1 = new StackArray<>(5);
            pila1.push("A");
            pila1.push("B");
            pila1.push("C");
            System.out.println(pila1);
            System.out.println("Tope: " + pila1.top());
            pila1.pop();
            System.out.println("Después de pop: " + pila1);

            System.out.println("\n=== Actividad 2: QueueLink ===");
            Queue<Integer> cola1 = new QueueLink<>();
            cola1.enqueue(10);
            cola1.enqueue(20);
            cola1.enqueue(30);
            System.out.println(cola1);
            System.out.println("Frente: " + cola1.front());
            cola1.dequeue();
            System.out.println("Después de dequeue: " + cola1);

            System.out.println("\n=== Actividad 3: PriorityQueueLinkSort ===");
            PriorityQueue<String, Integer> colaP1 = new PriorityQueueLinkSort<>();
            colaP1.enqueue("Normal", 1);
            colaP1.enqueue("Urgente", 3);
            colaP1.enqueue("Media", 2);
            System.out.println(colaP1);
            colaP1.dequeue();
            System.out.println("Después de dequeue: " + colaP1);

            System.out.println("\n=== Ejercicio 1: StackLink (pila con lista enlazada) ===");
            Stack<String> pila2 = new StackLink<>();
            pila2.push("X");
            pila2.push("Y");
            pila2.push("Z");
            System.out.println(pila2);
            pila2.pop();
            System.out.println("Después de pop: " + pila2);

            System.out.println("\n=== Ejercicio 2: QueueArray (cola con arreglo) ===");
            Queue<String> cola2 = new QueueArray<>(4);
            cola2.enqueue("Uno");
            cola2.enqueue("Dos");
            cola2.enqueue("Tres");
            System.out.println(cola2);
            cola2.dequeue();
            System.out.println("Después de dequeue: " + cola2);

            System.out.println("\n=== Ejercicio 3: PriorityQueueLinked (colas múltiples por prioridad) ===");
            PriorityQueue<String, Integer> colaP2 = new PriorityQueueLinked<>(4);
            colaP2.enqueue("Tarea leve", 0);
            colaP2.enqueue("Tarea media", 1);
            colaP2.enqueue("Tarea urgente", 3);
            colaP2.enqueue("Tarea alta", 2);
            System.out.println(colaP2);
            colaP2.dequeue();
            System.out.println("Después de dequeue: \n" + colaP2);

        } catch (ExceptionIsEmpty e) {
            System.out.println("Excepción: " + e.getMessage());
        }
