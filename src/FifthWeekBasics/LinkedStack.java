package FifthWeekBasics;

public class LinkedStack {
    LinkedList list;

    public LinkedStack() {
        this.list = new LinkedList();
    }

    public void push(int value){

        list.add(value);

    }

    public Node pop(){
        Node temporaryNode = list.first;
        list.first = list.first.next;
        return temporaryNode;
    }

    public static void main(String[] args) {
        LinkedStack list1 = new LinkedStack();
        list1.push(6);
        list1.push(4);
        list1.push(6);
        list1.push(9);
        list1.list.print();
        list1.pop();
        System.out.println();
        list1.list.print();


    }

}


