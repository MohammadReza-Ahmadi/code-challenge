public class ReverseString {


    public static String reverseRecursively(String str) {

        // a b c -> ba ->
        //

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }



}
