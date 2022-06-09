package _3_height_of_binary_search_tree;

import java.util.Scanner;

class Node {
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

    /*
    class Node
        int data;
        Node left;
        Node right;
    */
    public static int height(Node root) {
        return innerHeight(root, -1);
    }

    public static int innerHeight(Node root, int maxHeight) {
        if (root == null)
            return maxHeight;
        maxHeight++;
        return Math.max(innerHeight(root.left, maxHeight), innerHeight(root.right, maxHeight));
    }

    public static Node insert(Node root, int data) {
        // {25, 20, 15, 27, 30, 29, 26, 22, 32}
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
}
