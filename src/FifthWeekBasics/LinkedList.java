package FifthWeekBasics;

public class LinkedList {
    Node first;


    public Node add(int value) {
        if (first == null) {
            first = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = first;
            first = newNode;
        }
        return first;
    }

    public void delete(int element) {
        Node temporaryLink = first;
        Node previous = null;
        while (temporaryLink != null) {
            if (temporaryLink.value == element) {
                if (previous == null) {
                    first = first.next;
                    return;
                }
                previous.next = temporaryLink.next;
            }

            previous = temporaryLink;
            temporaryLink = temporaryLink.next;
        }
    }

    //make this look for every element with that value and delete them all
    public void deleteAllElements(int element) {
        Node temporaryLink = first;
        Node previous = null;
        int counter = 0;
        while (temporaryLink != null) {
            if (temporaryLink.value == element) {
                counter++;
            }
            temporaryLink = temporaryLink.next;
        }
        temporaryLink = first;

        while (temporaryLink != null && counter > 0) {
            if (temporaryLink.value == element) {
                if (previous == null) {
                    first = first.next;
                    return;
                }
                previous.next = temporaryLink.next;
            }

            previous = temporaryLink;
            temporaryLink = temporaryLink.next;
        }
    }

    public boolean search(int value) {
        Node temporaryLink = first;
        while (temporaryLink != null) {
            if (temporaryLink.value == value) {
                return true;

            }
            temporaryLink = temporaryLink.next;
        }

        return false;
    }

    public void print() {
        Node temporaryLink = first;
        while (temporaryLink != null) {
            System.out.println(temporaryLink.value);
            temporaryLink = temporaryLink.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(25);
        list.add(19);
        list.add(45);
        list.add(19);
        list.add(9);
        list.add(19);
        list.add(15);
        list.add(19);
        list.add(18);
        list.print();
        boolean answer = list.search(15);
        System.out.println(answer);
        list.deleteAllElements(19);
        list.print();

    }


}
