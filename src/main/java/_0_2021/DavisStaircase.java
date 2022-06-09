package _0_2021;

/*
* Davis has a number of staircases in his house and he likes to climb each staircase , , or  steps at a time. Being a very precocious child, he wonders how many ways there are to reach the top of the staircase.

Given the respective heights for each of the  staircases in his house, find and print the number of ways he can climb each staircase, module  on a new line.

Example


The staircase has  steps. Davis can step on the following sequences of steps:

1 1 1 1 1
1 1 1 2
1 1 2 1
1 2 1 1
2 1 1 1
1 2 2
2 2 1
2 1 2
1 1 3
1 3 1
3 1 1
2 3
3 2
There are  possible ways he can take these  steps and

Function Description

Complete the stepPerms function using recursion in the editor below.

stepPerms has the following parameter(s):

int n: the number of stairs in the staircase
Returns

int: the number of ways Davis can climb the staircase, modulo 10000000007
Input Format

The first line contains a single integer, , the number of staircases in his house.
Each of the following  lines contains a single integer, , the height of staircase .

Constraints

Subtasks

 for  of the maximum score.
Sample Input

STDIN   Function
-----   --------
3       s = 3 (number of staircases)
1       first staircase n = 1
3       second n = 3
7       third n = 7
Sample Output

1
4
44
Explanation

Let's calculate the number of ways of climbing the first two of the Davis'  staircases:

The first staircase only has  step, so there is only one way for him to climb it (i.e., by jumping  step). Thus, we print  on a new line.
The second staircase has  steps and he can climb it in any of the four following ways:
Thus, we print  on a new line.
* */

public class DavisStaircase {

    /*
     * Complete the 'stepPerms' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int stepPerms(int n) {
        if (n <= 2)
            return n;
        int[] waysCountArr = new int[n + 1];
        waysCountArr[0] = 0;
        waysCountArr[1] = 1;
        waysCountArr[2] = 2;
        waysCountArr[3] = 4;
        for (int i=4; i <=n; i++){
            waysCountArr[i] = waysCountArr[i-1] + waysCountArr[i-2] + waysCountArr[i-3];
        }

        return waysCountArr[n];
    }
}
