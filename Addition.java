package com.task;

import java.util.Scanner;

class Add
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

public class Addition 

{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Add add = new Add();
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int res = add.add(a, b);
		System.out.println(res);
		
	}
}
