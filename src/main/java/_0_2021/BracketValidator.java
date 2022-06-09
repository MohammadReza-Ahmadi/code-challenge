package _0_2021;


import java.util.ArrayList;
import java.util.List;

public class BracketValidator {

    /*
     * Click `Run` to execute the snippet below!
     */


    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
        }
    }


    public class MyStack {
        private List<String> oc = new ArrayList<>();

        public void push(String str) {
            oc.add(str);
        }

        public void pop(String str) {
            oc.remove(oc.size() - 1);
        }
    }

    public enum OPENER_CLOSER {

    }


}
