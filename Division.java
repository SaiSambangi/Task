package com.task;


import java.util.Scanner;

class Div {
    public int divide(int a, int b) {
        return a / b;
    }
}

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Div div = new Div();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b != 0) {
            int res = div.divide(a, b);
            System.out.println(res);
        } else {
            System.out.println("Cannot divide by zero");
        }

       
    }
}
