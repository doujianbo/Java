/**
 * @author doujianbo
 * @time 2014年5月23日
 * @file Operation.java 
 * 
 */
package com.djb.module;

/**
 * Operation
 */
public class Operation {
	private double _numberA = 0;
	private double _numberB = 0.0;
	/**
	 * @return the _numberB
	 */
	public double get_numberB() {
		return _numberB;
	}
	/**
	 * @param  the _numberB to set
	 */
	public void set_numberB(double _numberB) {
		this._numberB = _numberB;
	}
	/**
	 * @return the _numberA
	 */
	public double get_numberA() {
		return _numberA;
	}
	/**
	 * @param the _numberA to set
	 */
	public void set_numberA(double _numberA) {
		this._numberA = _numberA;
	}
	public  double GetResult()
	{
		double result = 0;
		return result;
	}

}

class OperationAdd extends Operation
{
	public  double GetResult()
	{
		double result = 0;
		result = get_numberA() + get_numberB();
		return result;
		
	}
}
;