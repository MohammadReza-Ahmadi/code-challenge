package _20_replace_every_element_with_greates_on_the_right;

public class ReplaceElementsWithGreatestOnTheRight {

    public static int[] replaceElements(int[] array) {
        int temp = array[array.length - 1];
        int maxRight = temp;
        array[array.length - 1] = -1;
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] > maxRight) {
                temp = array[i];
            }
            array[i] = maxRight;
            maxRight = temp;
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        return array;
    }
}
