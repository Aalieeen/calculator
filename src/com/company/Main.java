package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w1, w2, w3;
        System.out.println("введите первое число ");
        w1 = scanner.nextInt();
        System.out.println("введите второе число ");
        w2 = scanner.nextInt();
        w3 = w1 + w2;
        System.out.println("ответ = " + w3);
    }
}
