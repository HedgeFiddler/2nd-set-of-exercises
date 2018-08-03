package FifthWeekBasics;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public void add(int element) {
        if (element > value) {
            if (right != null) {
                right.add(element);
            } else {
                TreeNode newNode = new TreeNode(element);
                right = newNode;
            }
        } else {
            if (left != null) {
                left.add(element);
            } else {
                TreeNode newNode = new TreeNode(element);
                left = newNode;
            }
        }
    }

    public boolean search(int element) {
        if (value == element) {
            return true;
        }
        if (value > element && right != null) {
            right.search(element);

        }
        if (value < element && left != null) {
            left.search(element);
        }

        return false;
    }

    public boolean searchIter(int element) {

        TreeNode tempNode = this;

        while (element != tempNode.value ) {
            if (tempNode.value == element) {
                return true;
            }

            if (element > tempNode.value && tempNode != null ){
                tempNode = tempNode.right;
            }
            if (element < tempNode.value && tempNode != null ) {
                tempNode = tempNode.left;
            }


        }

        return false;
    }




}
