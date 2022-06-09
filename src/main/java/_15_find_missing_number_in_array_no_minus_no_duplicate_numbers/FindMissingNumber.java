package _15_find_missing_number_in_array_no_minus_no_duplicate_numbers;

public class FindMissingNumber {

    public static int findMissNumber_method1(int[] array) {
        int n = array.length;
        int sum = (n + 1) * (n + 2) / 2;
        for (int i=0; i<array.length; i++){
            sum-=array[i];
        }
        System.out.println("method1', missNum="+sum);
        return sum;
    }

    public static int findMissNumber_method2(int[] array) {
        int x1 = array[0];
        int x2 = 1;
        for (int i = 1; i < array.length; i++) {
//            System.out.print("arr[" + i + "]=" + array[i] + ", x1=" + x1);
            x1 = x1 ^ array[i];
//            System.out.print(", x1^arr[" + i + "]=" + x1);
//            System.out.println();
        }

//        System.out.println("...... second for .......");
        for (int i = 2; i <= array.length + 1; i++) {
//            System.out.print("i=" + i + ", x2=" + x2);
            x2 = x2 ^ i;
//            System.out.print(", x2^i=" + x2);
//            System.out.println();
        }

        System.out.println("method2, missNum="+(x1^x2));
        return x1 ^ x2;
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 20;
        System.out.println(a ^ b);

    }
}
