package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập USD");
        double usd = sc.nextDouble();
        double vnd = usd * 2300;
        System.out.println(usd + "USD = " +vnd + "VND");
    }
}
