public class SpecialStringAgain_My {

    static long substrCount(int n, String s) {
        if(n==1){
            return 1;
        }

        long count = n;
        System.out.println(s);
        for(int i=0; i < s.length(); i++){
            for(int j=s.length()-1; j > i; j--){
                if (isContainSpecial(s,s.charAt(i), i,j)){
                    System.out.println(s.substring(i,j+1) + "   count="+count);
                    count++;
                }
            }
        }
        return count;

    }

    static boolean isContainSpecial(String str, char repeat, int i, int j){
        while (i < j) {

            if (str.charAt(i) != str.charAt(j) || str.charAt(i) != repeat)
                return false;

            i++;
            j--;
        }

        return true;
    }
}
