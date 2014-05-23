package com.nsfocus.dou;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

import java.util.logging.*;

public class Test {
	
	public static int factorial(int n)//
	{
		System.out.println("factorial(" + n + "):");
		Throwable throwable = new Throwable();
		StackTraceElement[] framesElements = throwable.getStackTrace();
		for(StackTraceElement f: framesElements)
		{
			System.out.println(f);
		}
		int r;
		if(n <= 1) r = 1;
		else r = n*factorial(n-1);
		System.out.println("return " + r);
		return r;
	}
	
	public static void main(String args[])
	{
		
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = inScanner.nextInt();
		//assert n >= 0 : "n>=0";
		Logger.global.info("File->Open menu item selected!");
		
		
	}
}
 