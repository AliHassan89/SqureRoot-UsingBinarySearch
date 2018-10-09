/*
Square root of int using binary search

 */

package main.java;

public class CalculateSqrt {

    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }

    public static int sqrt(int val) {
        if (val <= 0)
            return 0;
        if (val == 1)
            return val;

        int currentVal = 0;
        int lower = 0;
        int upper = val;

        while (true) {
            if (currentVal * currentVal <= val &&
                    ((currentVal+1)*(currentVal+1) > val)) {
                break;
            }
            else if (currentVal * currentVal > val) {
                int y0 = currentVal;
                currentVal = (upper + lower) / 2;
                upper = y0;
            }
            else if (currentVal * currentVal < val) {
                int x0 = currentVal;
                currentVal = (upper + lower) / 2;
                lower = x0;
            }
        }

        return currentVal;
    }
}
