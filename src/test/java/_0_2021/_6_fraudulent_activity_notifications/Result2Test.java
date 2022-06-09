package _0_2021._6_fraudulent_activity_notifications;

import org.junit.jupiter.api.Test;
import utils.MyUtils;

import java.util.Arrays;
import java.util.List;

import static _0_2021._6_fraudulent_activity_notifications.Result2.activityNotifications;

class Result2Test {

    @Test
    public void test_1() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int d = 3;
        int c = activityNotifications(list, d);
        System.out.println(c);
    }

    @Test
    public void test_2() {
        List<Integer> list = Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5);
        int d = 5;
        int c = activityNotifications(list, d);
        System.out.println(c);
    }

    @Test
    public void test_3() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4);
        int d = 4;
        int c = activityNotifications(list, d);
        System.out.println(c);
    }

    @Test
    public void test_4() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int d = 4;
        int c = activityNotifications(list, d);
        System.out.println(c);
    }

    @Test
    public void test_5() {
        List<Integer> list = Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5);
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int d = 5;
        int c = activityNotifications(list, d);
        System.out.println("notificationCount: " + c);
//        Assertions.assertEquals(2, c);
    }

    @Test
    public void test_6() {
        String fileContent = MyUtils.readNumberSpaceSeparatedFileFromResource("number_space_separated.txt");
        List<Integer> list = MyUtils.convertSpaceSeparatedIntValuesStringToIntArray(fileContent);
        int d = 10000;
        int c = activityNotifications(list, d);
        System.out.println("notificationCount: " + c);
//        Assertions.assertEquals(633, c);
    }


}