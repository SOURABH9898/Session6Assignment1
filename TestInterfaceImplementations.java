package com.acadglid.java.core.session6.assignment1;

import java.util.Scanner;

public class TestInterfaceImplementations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value");
		int number=s.nextInt();
		NumberI printValue=new PrinitValue();
		printValue.printNumber(number);
		
		printValue=new PrintSquareValue();
		printValue.printNumber(number);
	}

}
