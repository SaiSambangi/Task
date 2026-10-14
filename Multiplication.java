package com.task;


import java.util.Scanner;

class Mul {
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mul mul = new Mul();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = mul.multiply(a, b);
        System.out.println(res);

       
    }
}
