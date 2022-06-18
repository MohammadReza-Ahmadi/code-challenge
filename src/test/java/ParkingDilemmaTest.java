import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingDilemmaTest {

    @Test
    public void test1(){
        int[] cars = {2, 10, 8, 17};
        int k = 3;
        Assertions.assertEquals(9,ParkingDilemma.minLengthOfRoof(cars,k));
    }

    @Test
    public void test2(){
        int[] cars = {7,6,10,3,1,8,5};
        int k = 3;
        Assertions.assertEquals(3,ParkingDilemma.minLengthOfRoof(cars,k));
    }

    @Test
    public void test3(){
        int[] cars = {7,6,10,3,1,8,5};
        int k = 4;
        Assertions.assertEquals(4,ParkingDilemma.minLengthOfRoof(cars,k));
    }

    @Test
    public void test4(){
        int[] cars = {7,6,11,3,1,8,5};
        int k = 4;
        Assertions.assertEquals(4,ParkingDilemma.minLengthOfRoof(cars,k));
    }

}