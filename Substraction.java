package com.task;



import java.util.Scanner;

class Sub {
    public int sub(int a, int b) {
        return a - b;
    }
}

public class Substraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sub sub = new Sub();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = sub.sub(a, b);
        System.out.println(res);

    }
}
