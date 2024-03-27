package org.example.Threes.BinaryTree;

public class Main {
    public static void main(String[] args) {

        Node node = new Node("a");

        Operations operations = new Operations();

        operations.InsertLeft  (node, "b");
        operations.InsertRight (node,"c");

        Node nodeb = new Node(node.left.value);
        operations.InsertRight (nodeb,"d");

        Node nodec = new Node(node.right.value);
        operations.InsertRight (nodec,"f");
        operations.InsertLeft (nodec,"e");

        Node noded = new Node(nodeb.right.value);
        Node nodee = new Node(nodec.left.value);
        Node nodef = new Node(nodec.right.value);

        System.out.println("Root: " +  node.value);
        System.out.println("Left: " +  node.left.value);
        System.out.println("Right: " + node.right.value);

        System.out.println("A Node: " +  node.value);
        System.out.println("B Node: " + nodeb.value);
        System.out.println("C Node: " + nodec.value);
        System.out.println("D Node: " + noded.value);
        System.out.println("E Node: " + nodee.value);
        System.out.println("F Node: " + nodef.value);


        Node preOrderNode = new Node("1");
        operations.InsertLeft(preOrderNode, "2");
        operations.InsertLeft(preOrderNode.left, "3");
        operations.InsertRight(preOrderNode.left, "4");
        operations.InsertRight(preOrderNode, "5");
        operations.InsertLeft(preOrderNode.right, "6");
        operations.InsertRight(preOrderNode.right, "7");

        operations.PreOrder(node);
        operations.PreOrder(preOrderNode);
    }
}
