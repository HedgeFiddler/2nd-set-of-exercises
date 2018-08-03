package com.company;

public class Queue {
    private int head;
    private int tail;
    private int[] array;
    private int counter;

    public Queue(int size) {
        this.array = new int[size];
        tail = 1;
        head = 1;
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;

        }
    }

    public boolean enqueue(int element) {

        if (counter == array.length) {
            System.out.println("Unable to insert!");
            return false;
        }

        array[tail] = element;
        tail++;
        counter++;
        if (tail == array.length) {
            tail = 0;
        }

        printQueue();
        return true;

    }

    public int dequeue() {

        if (counter == 0) {
            return -1;
        }
        int arrayHead = array[head];
        array[head] = -1;
        head++;
        if (head >= array.length) {
            head = 0;
        }
        counter--;
        printQueue();
        return arrayHead;


    }

    public void printQueue() {
        System.out.println("Queue values: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public void sumQueue() {
        int elementSum = 0;
        for (int i = 0; i < array.length; i++) {
            elementSum = elementSum + array[i];
        }
        System.out.println("The sum of the elements in the array is: " + elementSum);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(125);
        queue.enqueue(51);
        queue.enqueue(27);
        queue.enqueue(284);
        queue.enqueue(28);
        queue.enqueue(81);
        queue.sumQueue();
        int removedElement = queue.dequeue();
        System.out.println(removedElement);
        queue.dequeue();

    }
}
