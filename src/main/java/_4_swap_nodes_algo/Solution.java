package _4_swap_nodes_algo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    /*
     * Complete the swapNodes function below.
     */
    static int[][] swapNodes(int[][] indexes, int[] queries) {
        int[][] swapIndexes=new int[queries.length][indexes.length];
        Node node = createTree(indexes);
        int depth= calcDepth(node,-1);
        for (int k=0; k<queries.length;k++) {
            int m = 1;
            while (m*queries[k]<= depth){
                innerSwapNodes(node,m*queries[k]);
                m++;
            }
            List<Integer> inOrderList = inOrderInner(node, new ArrayList<>());
            for (int i=0; i<inOrderList.size(); i++){
                swapIndexes[k][i]=inOrderList.get(i);
            }
        }

        for (int[] s : swapIndexes) {
            for (int i : s) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
        return swapIndexes;
    }

    static Node createTree(int[][] indexes) {
        Map<Integer, Node> nodeMap = new HashMap<>();
        Node root = new Node(1);
        nodeMap.put(1, root);
        for (int i = 0; i < indexes.length; i++) {
            Node node = nodeMap.get(i + 1);
            if (node != null) {
                if (indexes[i][0] != -1) {
                    nodeMap.put(indexes[i][0], new Node(indexes[i][0]));
                    node.left = nodeMap.get(indexes[i][0]);
                }

                if (indexes[i][1] != -1) {
                    nodeMap.put(indexes[i][1], new Node(indexes[i][1]));
                    node.right = nodeMap.get(indexes[i][1]);
                }
            }
        }
        return root;
    }

    public static int calcDepth(Node root, int maxHeight) {
        if(root==null)
            return maxHeight;
        maxHeight++;
        return Math.max(calcDepth(root.left,maxHeight), calcDepth(root.right,maxHeight));
    }

    public static List<Integer> inOrderInner(Node root, List<Integer> preorder) {
        if (root == null)
            return preorder;

        inOrderInner(root.left, preorder);
        preorder.add(root.data);
        inOrderInner(root.right, preorder);
        return preorder;
    }

    static void innerSwapNodes(Node node, int k) {
        if(node==null)
            return;

        if (k == 1) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
            return;
        }

        k--;
        innerSwapNodes(node.left, k);
        innerSwapNodes(node.right, k);
    }


    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        int[][] indexes = new int[n][2];

        for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
            String[] indexesRowItems = scanner.nextLine().split(" ");

            for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
                int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
                indexes[indexesRowItr][indexesColumnItr] = indexesItem;
            }
        }

        int queriesCount = Integer.parseInt(scanner.nextLine().trim());

        int[] queries = new int[queriesCount];

        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
            int queriesItem = Integer.parseInt(scanner.nextLine().trim());
            queries[queriesItr] = queriesItem;
        }

        int[][] result = swapNodes(indexes, queries);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));

                if (resultColumnItr != result[resultRowItr].length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
