import java.util.HashMap;
import java.util.Map;

/**
 * write a function takes an integer and convert it into english words.
 * Exp: Input: 1234 Output: One thousand two hundred thirty four
 */

public class ConvertIntegerToEnglishWord {


    public static String convert(int digit){
        Map<Integer, String> map = getNumberStrMap();
        if(digit < 10){
            return map.get(digit);
        }

        StringBuilder sb = new StringBuilder();
        String strDigit = String.valueOf(digit);
        for (int i=0; i < strDigit.length(); i++){
            int level = (int) Math.pow(10,strDigit.length()-i - 1);
            int bigPart = Integer.parseInt(strDigit.substring(i,i+1));
            if(bigPart == 0){
                continue;
            }
            if (level == 10 && digit >= 20){
                bigPart *=level;
            }
            sb.append(map.get(bigPart));
            sb.append(" ");
            if (level > 99){
                sb.append(map.get(level));
                sb.append(" ");
            }
        }
        System.out.println(digit);
        return sb.toString();
    }

    public static String convert2(int digit){
        Map<Integer, String> map = getNumberStrMap();
        if(digit < 10){
            return map.get(digit);
        }

        StringBuilder sb = new StringBuilder();
        int len = String.valueOf(digit).length();
        for (int i=len; i > 0; i--){
            int num = digit % (10^(i-1));
            sb.append(map.get(num));
        }

        return null;
    }

    private static Map<Integer, String> getNumberStrMap(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        map.put(11,"eleven");
        map.put(12,"twelve");
        map.put(13,"thirteen");
        map.put(14,"fourteen");
        map.put(15,"fifteen");
        map.put(16,"sixteen");
        map.put(17,"seventeen");
        map.put(18,"eighteen");
        map.put(19,"nineteen");
        map.put(20,"twenty");
        map.put(30,"thirty");
        map.put(40,"forty");
        map.put(50,"fifty");
        map.put(60,"sixty");
        map.put(70,"seventy");
        map.put(80,"eighty");
        map.put(90,"ninety");
        map.put(100,"hundred");
        map.put(1000,"thousand");
        map.put(1000000,"million");
        map.put(1000000000,"billion");
        return map;
    }
}
