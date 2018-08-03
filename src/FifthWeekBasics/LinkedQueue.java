package FifthWeekBasics;

public class LinkedQueue {
    private LinkedList list;
    private Node head = null;
    private int size = 0;
    private int maxSize;


    public LinkedQueue(int maxSize) {
        this.list = new LinkedList();
        this.maxSize = maxSize;
    }

    public boolean enqueue(int value) {
        if (size == maxSize) {
            System.out.println("The queue is full right now.");
            return false;
        }
        list.add(value);
        if(head == null){
            head = list.first;
        }
        size++;
        return true;

    }

//    public boolean dequeue(){
//
//        if(size == 0){
//            System.out.println("The Queue is empty");
//            return false;
//        }
//
//        head.next.next = null;
//        head = ;
//        size--;
//        return true;
//
//    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue(5);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(2);
        queue.enqueue(9);
        queue.enqueue(12);
        queue.list.print();
        queue.enqueue(19);
//        queue.dequeue();
        queue.list.print();
        queue.enqueue(19);
        System.out.println();
        queue.list.print();


    }
}
