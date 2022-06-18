import java.util.Arrays;

/**
 * There are many cars parked in the parking lot. The parking is a straight very long line and a parking slot for every single meter.
 * There are cars parked currently and you want to cover them from the rain by building a roof.
 * The requirement is that at least k cars are covered by the roof.What's the minium length of the roof that would cover k cars?
 * The function has the following parameters:
 * cars: integer array of length denoting the parking slots where cars are parked
 * k: integer denoting the number of cars that have to be covered by the roof
 * Example
 * Example:
 * Input:
 * cars: [2, 10, 8, 17]
 * k: 3
 * output: 9
 * Explanation: you can build a roof of length 9 covering all parking slots from the 2nd one to the 10th one,
 * so covering 3 cars at slots 2, 10, 8, there are no shorter roof  that can cover 3 cars, so the answer is 9
 * Notice
 * 1 <= n <= 10^5
 * 1 <= k <= n
 * 1 <= cars[i] <= 10^14
 * All slots token by cars are unique
 */

public class ParkingDilemma {


    public static int minLengthOfRoof(int[] cars, int k){
        int minLen = 0;
        if(cars.length <= k){
            for (int i=0; i < cars.length; i++){
                minLen += cars[i];
            }

        } else {

            Arrays.sort(cars);
            int[] preSum = new int[cars.length];
            for (int i=0; i < cars.length; i++){
                preSum[i] = preSum[i] + cars[i];
            }

            minLen = Integer.MAX_VALUE;
            for (int i=k-1; i < preSum.length - 1; i++){
                minLen = Math.min(preSum[i] - preSum[i-k+1] + 1, preSum[i+1] - preSum[i-k+1] + 1);
            }
        }

        return minLen;
    }

    public static int minLengthOfRoofWorksFor3Cars(int[] cars){
        int k = 3;
        if (cars.length == 0){
            return 1;
        }

        int minLen = 0;
        if (cars.length <=3){
            for(int i=0; i < cars.length -1; i++){
                minLen += cars[i+1] - cars[i];
            }
        }

        int a,b,c;
        minLen = Integer.MAX_VALUE;
        a = Math.abs(cars[1] - cars[0]);
        b = Math.abs(cars[2] - cars[1]);

        Arrays.sort(cars );
        for (int i=2; i < cars.length - 1; i++){
            c = Math.abs(cars[i+1] - cars[i]);
            minLen = Math.min(a+b, b+c);
            a = b;
            b = c;
        }

        return minLen;
    }
}
