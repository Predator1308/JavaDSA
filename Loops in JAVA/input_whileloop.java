package Lec_02;

import java.util.Scanner;

public class input_whileloop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        while (i < n) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println(i);
    }
}
