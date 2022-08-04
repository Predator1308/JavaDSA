package Lec_02;

import java.util.*;

public class HCF {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N1 = scn.nextInt();
        int N2 = scn.nextInt();

        int divisor = N1;
        int dividend = N2;

        while (divisor > 0) {
            int remainder = dividend % divisor;
//			System.out.println(remainder);
//			A
//			divisor = remainder;
//			dividend = divisor;
//			B
            dividend = divisor;
            divisor = remainder;
        }
        System.out.println(dividend);

    }
}
