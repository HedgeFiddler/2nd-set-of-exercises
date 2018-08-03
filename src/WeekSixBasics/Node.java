package WeekSixBasics;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int value) {
        this.data = data;
    }

    public void add(int element) {
        if (element > data) {
            if (right != null) {
                right.add(element);
            } else {
                Node newNode = new Node(element);
                right = newNode;
            }
        } else {
            if (left != null) {
                left.add(element);
            } else {
                Node newNode = new Node(element);
                left = newNode;
            }
        }
    }
}
