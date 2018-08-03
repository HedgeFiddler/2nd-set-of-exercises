package FifthWeekBasics;

public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;

    }


    public Node add(int a) {
        Node newFirstNode = new Node(a);
        //Link new node to current node
        newFirstNode.next = this;
        //returning new first node
        return newFirstNode;

    }

    public void printWholeList() {
        System.out.println(value);
        if (next != null) {
            next.printWholeList();
        }

    }

    public boolean search(int search) {
        if (value == search) {
            return true;
        }
        if (next != null) {
            return next.search(search);
        }
        return false;
    }

    public void delete(int element, Node previous) {
        if (value == element) {
//            if (previous == null) {
//                this = this.deleteFirst();
//
//
//            }
            previous.next = next;
            System.out.println("Deletion successful!");
        } else if(next != null) {
            next.delete(element, previous);
        }

    }
    public Node deleteFirst(){

        return next;

    }
    public static Node deleteList(int element, Node list){
        if(list.value == element){
            list = list.deleteFirst();
            return list;

        }
        list.next.delete(element, list);
        return list.next;
    }


    public static void main(String[] args) {





//        Node list1 = new Node(1);
//        list1 = list1.add(3);
//        list1 = list1.add(3);
//        list1 = list1.add(2);
//        list1 = list1.add(3);
//        list1 = list1.add(3);
//        list1 = list1.add(3);
//        list1 = list1.add(3);
//        list1.printWholeList();
//
//        list1.deleteList(4, list1);
//        list1.printWholeList();
//        int el = 2;
//        boolean exist = list1.search(el);
//        System.out.println("Element " + el + " result: " + exist);

//        list1.delete(2, list1.next.next.next);
//        System.out.println();
//        list1.printWholeList();


    }
}
