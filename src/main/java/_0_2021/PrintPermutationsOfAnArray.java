package _0_2021;

public class PrintPermutationsOfAnArray {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        PrintPermutationsOfAnArray p = new PrintPermutationsOfAnArray();
        p.permute(arr, 0);
    }

    public void permute(int[] arr, int s) {
        if (s == arr.length - 1)
            printArr(arr);

        for (int i = s; i < arr.length; i++) {
            swap(arr, i, s);
            permute(arr, s + 1);
            swap(arr, i, s);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}
