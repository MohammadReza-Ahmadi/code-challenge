package _0_2021._6_fraudulent_activity_notifications;

import java.util.Arrays;
import java.util.List;

class Result2 {

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */

    public static int[] cnt;

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int n = expenditure.size();
        cnt = new int[201];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = expenditure.get(i);
        }
        for (int i = 0; i < d; i++) {
            cnt[a[i]]++;
        }
        int res = 0;
        for (int i = d; i < n; i++) {
            int m = med(d);
            //out.println(m);
            if (a[i] >= m) {
                res++;
            }
            cnt[a[i - d]]--;
            cnt[a[i]]++;
        }
        System.out.println(res);
        return res;
    }

    public static int med(int d) {
        int[] a = Arrays.copyOf(cnt, cnt.length);
        int r = d / 2;
        if (d % 2 == 1) {
            r++;
        }
        int res = 0;
        boolean odd = d % 2 == 1;
        for (int k = 0; k <= 200; k++) {
            while (r > 0 && a[k] > 0) {
                a[k]--;
                r--;
            }
            if (r == 0) {
                res += k;
                if (d % 2 == 0) {
                    d--;
                    r++;
                    if (a[k] > 0) {
                        return 2 * k;
                    }
                } else {
                    break;
                }
            }
        }
        return res * (odd ? 2 : 1);
    }


}
