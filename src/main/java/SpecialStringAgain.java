public class SpecialStringAgain {

    static long substrCount(int n, String s) {
        System.out.println(s);
        long ans = s.length();
        for (int i=0; i < s.length(); i++){
            long repeat = 0;
            while (i + 1 < s.length() && s.charAt(i)==s.charAt(i+1)){
                System.out.println(s.charAt(i)+s.charAt(i+1));
                repeat++;
                i++;
            }

            ans += repeat * (repeat+1)/2;
            int pointer = 1;
            while (i - pointer >= 0 && i + pointer < s.length() &&
                    s.charAt(i + pointer) == s.charAt(i - 1) &&
                    s.charAt(i - pointer) == s.charAt(i - 1)

            ){
                System.out.println(""+s.charAt(i - pointer)+s.charAt(i)+s.charAt(i+pointer));
                ans++;
                pointer++;
            }
        }
        return ans;
    }
}
