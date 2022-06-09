package _0_2021._1_trie_insert_and_search;// { Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.util.Scanner;

class TrieInsertAndSearch {
    static final int ALPHABET_SIZE = 26;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] keys = sc.nextLine().split(" ");

            TrieNode root = new TrieNode();
            for (int i = 0; i < n; i++) {
                insert(root, keys[i]);
            }

            int i = 0;
            System.out.println("content is: ");
            for (TrieNode child : root.children) {
                if (child != null)
                    System.out.print((char) ('a' + i));
                else
                    System.out.print(" ");
                i++;
            }
            System.out.println();

            String abc = sc.nextLine();
            System.out.println("search for: \n" + abc);
            System.out.println("the result: ");
            if (search(root, abc))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    static void insert(TrieNode root, String key)
    {
        int level;
        int length = key.length();
        int index;

        TrieNode pCrawl = root;

        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();

            pCrawl = pCrawl.children[index];
        }

        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }

    // Returns true if key presents in trie, else false
    static boolean search(TrieNode root, String key)
    {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;

        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';

            if (pCrawl.children[index] == null)
                return false;

            pCrawl = pCrawl.children[index];
        }

        return (pCrawl != null && pCrawl.isEndOfWord);
    }

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    }


// { Driver Code Starts.
}  // } Driver Code Ends