package Lec_02;

import java.util.*;

public class prime_check {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scn.nextInt();
        int div = 1;
        int factors = 0;
        while (div <= n) {
            int rem = n % div;
            if (rem == 0) {
                factors = factors + 1;
//                System.out.println(div);
            }
            div++;
        }
//        System.out.println(factors);
        if (factors == 2) {
            System.out.println("It is a Prime NO.");
        } else {
            System.out.println(" It is Not a Prime NO.");
        }
    }
}
