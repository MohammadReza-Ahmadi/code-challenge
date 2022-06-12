public class MakingAnagrams {

    // a = 97
    // z = 122
    // count of a to z = 26
    public static int makeAnagram(String a, String b) {
        int[] aChars = new int[26];
        int[] bChars = new int[26];

        for (int i = 0; i < a.length(); i++) {
            aChars[a.charAt(i) - 97]++;
        }

        for (int i = 0; i < b.length(); i++) {
            bChars[b.charAt(i) - 97]++;
        }

        int minDel = 0;
        for (int i = 0; i < 26; i++) {
            minDel += Math.abs(aChars[i] - bChars[i]);
        }

        return minDel;
    }
}
