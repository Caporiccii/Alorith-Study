package org.example.Threes;
import java.util.*;

public class LevelOrderTransversal {

    public static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public class Solution {

        public static void preOrder(Node root) {
                if (root == null) { return; }
                System.out.print(root.data + " ");
                preOrder(root.left);
                preOrder(root.right);
                //nao cheguei nesse codigo sozinho precisei de ajuda.
        }

        public static Node insert(Node root, int data) {
            if(root == null) {
                return new Node(data);
            } else {
                Node cur;
                if(data <= root.data) {
                    cur = insert(root.left, data);
                    root.left = cur;
                } else {
                    cur = insert(root.right, data);
                    root.right = cur;
                }
                return root;
            }
        }


    }

}
