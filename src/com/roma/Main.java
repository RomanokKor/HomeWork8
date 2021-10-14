package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a = 0;
        System.out.println("Введите число");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n <= 0) {
            System.out.println("Введите положительное число");
            n = s.nextInt();
        }
        for (int i = 1; i <= n; i = i + 2) {
            a = a + i;
        }

        System.out.println(a);
    }
}
