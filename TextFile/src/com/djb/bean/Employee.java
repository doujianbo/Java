/**
 * @author doujianbo
 * @time 2014年5月30日
 * @file Employee.java 
 * 
 */
package com.djb.bean;

import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Employee
 */
public class Employee {
	public Employee()
	{
		
	}
	public Employee(String n,double s,int year,int month,int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireday = calendar.getTime();
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
	public Date getHireday() {
		return hireday;
	}
	public void setHireday(Date hireday) {
		this.hireday = hireday;
	}
	public String toString()
	{
		return getClass().getName() + "[name = " +name+",salary="+salary+",hireday="+hireday+"]";
	}
	public void writeData(PrintWriter outPrint)
	{
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(hireday);
		outPrint.println("name"+salary+"|"+calendar.get(calendar.YEAR)+"|"+(calendar.get(calendar.MONTH)+1)
				+"|"+calendar.get(calendar.DAY_OF_MONTH));
	}
	public void readData(Scanner in)
	{
		String line = in.nextLine();
		String[] token = line.split("\\|");
		name = token[0];
		salary = Double.parseDouble(token[1]);
		int y = Integer.parseInt(token[2]);
		int m = Integer.parseInt(token[3]);
		int d = Integer.parseInt(token[4]);
		
	}
	private String name;
	private double salary;
	private Date hireday;

}
