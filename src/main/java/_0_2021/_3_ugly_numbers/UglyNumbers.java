//package _0_2021._3_ugly_numbers;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class UglyNumbers {
//    private Map<Integer, Boolean> uglyMap = new HashMap<>();
//
//    long getNthUglyNo(int n) {
//        uglyMap.put(1, true);
////        uglyMap.put(2, true);
////        uglyMap.put(3, true);
////        uglyMap.put(4, true);
////        uglyMap.put(5, true);
////        for (int i = 2; i <= n; i++){
////            if (uglyMap.get(n) != null || )
////        }
//     return 0;
//    }
//
//    boolean isUglyNumber(int n, Map<Integer, Boolean> uglyMap) {
////        if (uglyMap.get(n) != null || )
////            return true;
//
//        if (n % 2 == 0) {
//            if (uglyMap.get(n / 2))
//                return true;
//            return isUglyNumber(n / 2, uglyMap);
//        }
//
//        if (n % 3 == 0)
//            return isUglyNumber(n / 3);
//
//        if (n % 5 == 0)
//            return isUglyNumber(n / 5);
//
//        uglyMap.put(n, false);
//        return false;
//    }
//}
