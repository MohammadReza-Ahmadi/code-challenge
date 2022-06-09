package _0_2021;

public class Sawmills2 {

    int[] trunks = new int[]{2, 3, 1};


    public void calc(int[] LEC) {
        int p1 = 0;
        int p2 = 0;
        int maxP = 0;
        int[] selects = new int[LEC.length];
        int[] chos1 = new int[LEC.length];
        int[] chos2 = new int[LEC.length];
        for (int i = 0; i < LEC.length; i++) {

            int ip1 = reCalc(LEC[i], 3);
            chos1[i] = LEC[i];
            p1 +=ip1;

            int ip2 = 0;
            if (i < LEC.length - 1) {
                ip2 = reCalc(LEC[i + 1], 3);
                chos2[i] = LEC[i + 1];
                p2 += ip2;
            }

//            if (ip1 >= ip2)
//                selects[i] = LEC[i];
//            else
//                selects[i] = LEC[i + 1];
//            maxP = Math.max(ip1, ip2);
        }

//        System.out.println("selects are:");
//        for (int s : selects) {
//            System.out.print(s + ", ");
//        }
        System.out.println("chos1 are: maxP1="+p1);
        for (int s : chos1) {
            System.out.print(s + ", ");
        }

        System.out.println("\nchos1 are: maxP2="+p2);
        for (int s : chos2) {
            System.out.print(s + ", ");
        }
        System.out.println("maxP=" + maxP);
    }

    public int reCalc(int trunkLen, int cutLen) {
        if (trunkLen == 0 || cutLen <= 0)
            return 0;

        if (cutLen >= trunkLen) {
            return calcProfit(trunkLen);

        } else {
            int remLen = trunkLen - cutLen;
            int profit = calcProfit(cutLen);
            return profit + reCalc(remLen, 3);
        }
    }

    public int calcProfit(int trunkLen) {
        if (trunkLen == 1)
            return -1;
        if (trunkLen == 2)
            return 3;
        if (trunkLen == 3)
            return 1;
        return 0;
    }

}
