package _14_union_and_intersection_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionAndIntersectionOfTwoSortedArrays {

    public static int[] printUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i++]);
            } else if (arr2[j] < arr1[i]) {
                union.add(arr2[j++]);
            } else {
                union.add(arr1[i++]);
                j++;
            }
        }

        while (i < arr1.length)
            union.add(arr1[i++]);

        while (j < arr2.length)
            union.add(arr2[j++]);

        System.out.println("union:");
        for (int k = 0; k < union.size(); k++) {
            System.out.print(union.get(k) + (k < union.size() - 1 ? ", " : ""));
        }

        return union.stream().mapToInt(n -> n).toArray();
    }

    public static int[] printUnion_2(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length || j < arr2.length) {
            if (i >= arr1.length) {
                union.add(arr2[j]);
                j++;
                continue;
            }

            if (j >= arr2.length) {
                union.add(arr1[i]);
                i++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
                continue;
            }

            if (arr2[j] < arr1[i]) {
                union.add(arr2[j]);
                j++;
                continue;
            }

            union.add(arr1[i]);
            i++;
            j++;
        }

        System.out.println("union");
        for (int k = 0; k < union.size(); k++) {
            System.out.print(union.get(k) + (k < union.size() - 1 ? ", " : ""));
        }

        return union.stream().mapToInt(n -> n).toArray();
    }


    public static int[] printIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                intersection.add(arr1[i++]);
                j++;
            }
        }

        System.out.println("\nintersection:");
        for (int k = 0; k < intersection.size(); k++) {
            System.out.print(intersection.get(k) + (k < intersection.size() - 1 ? ", " : ""));
        }

        return intersection.stream().mapToInt(n -> n).toArray();
    }
}
