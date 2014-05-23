package com.nsfocus.dou;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Date;

public class Employee implements ActionListener{
	public Employee(String n,double s)
	{
		name = n; 
		salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent /100;
		salary += raise;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println("At the tone.the time is."+now);
		Toolkit.getDefaultToolkit().beep();
	}
	
	private String name;
	private double salary;

}