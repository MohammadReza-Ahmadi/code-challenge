package _0_2021;

import java.util.HashMap;
import java.util.Map;

public class PigLatin {

    public static void main(String[] args) {
//        System.out.println(pigLatinize("pig")); // should print out "ig-pay"
//        System.out.println(pigLatinize("pig latin")); //  "ig-pay atin-lay"
        pigLatinize("pig! alo Alo latin? Pig @Latin"); //  "ig-pay atin-lay"
//        System.out.println(pigLatinize("one! two?  three-    four     efive")); //  "ig-pay atin-lay"
        // System.out.println(pigLatinize("pig")); // should print out "ig-pay"

//        1) "pig" => "ig-pay"
//        2) "pig latin" => "ig-pay atin-lay"
//        3) "Pig Latin" => "ig-Pay atin-Lay"


    }

    // Implement this method:
    public static String pigLatinize(String phrase) {
        Map<String, String> map = new HashMap<>();
        for (String word : phrase.split("\\W+")) {
            String nw = word.substring(0, 1);
            if (nw.equalsIgnoreCase("a") || nw.equalsIgnoreCase("e") || nw.equalsIgnoreCase("i") || nw.equalsIgnoreCase("o") || nw.equalsIgnoreCase("u")) {
               nw = word.concat("-way");
            } else {
                nw = word.substring(1).concat("-".concat(nw).concat("ay"));
            }

            map.put(word,nw);
        }

        for (String word : phrase.split("\\W+")) {
            phrase = phrase.replaceFirst(word,map.get(word));
        }
        System.out.println(phrase);
        return phrase;
    }
}
