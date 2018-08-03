package FifthWeekBasics;

public class BinaryTree {

    TreeNode root;

    public BinaryTree(int element) {
        root = new TreeNode(element);
    }

    public void printTree(TreeNode treeNode) {
        System.out.println(treeNode.value);
        if (treeNode.left != null) {
            printTree(treeNode.left);
        }
        if (treeNode.right != null) {
            printTree(treeNode.right);
        }

    }


    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree(8);
        bTree.root.add(10);
        bTree.root.add(5);
        bTree.root.add(1);
        bTree.root.add(15);
        bTree.root.add(7);
        bTree.root.add(9);
        bTree.root.add(4);
        bTree.root.add(25);
        bTree.root.add(2);
        bTree.printTree(bTree.root);
        boolean answer = bTree.root.searchIter(15);
        System.out.println(answer);
    }
}
