package Lec_02;

import java.util.Scanner;

public class loop_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 1;
        int sum = 0;
        while (count <= n) {
//            System.out.println(count);
            sum = sum + count;
            count = count + 1;
        }
        System.out.println(sum);
    }
}
