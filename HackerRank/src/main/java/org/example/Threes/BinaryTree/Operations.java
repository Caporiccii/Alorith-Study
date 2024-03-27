package org.example.Threes.BinaryTree;

public class Operations {

    public Node InsertLeft (Node root, String value){
        Node newNode = null;
        if (root.left == null) {
            root.left = new Node(value);
        } else {
            newNode = new Node(value);
            newNode.left = root.left;
            root.left = newNode;
        }
        return root.left;
    }

    public Node InsertRight (Node root, String value){
        Node newNode = null;
        if (root.right == null) {
            root.right = new Node(value);
        } else {
            newNode = new Node(value);
            newNode.right = root.right;
            root.right = newNode;
        }
        return root.right;
    }

    public void PreOrder (Node root){
        System.out.println("Valor do no: " + root.value);

        if (root.left != null)
            PreOrder(root.left);

        if (root.right != null)
            PreOrder(root.right);
    }

    public void Order (Node root){

    }

}
