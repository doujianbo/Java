/**
 * @author doujianbo
 * @time 2014年5月5日
 * @file BallComponent.java 
 * 
 */
package com.dou.ball;
import java.awt.*;
import java.util.*;
import javax.swing.*;
/**
 * BallComponent面板类
 */
public class BallComponent extends JPanel{
	/**
	 * add a ball to the componnet
	 * @param b the ball to add
	 */
	public void add(Ball b)
	{
		ballslist.add(b);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		for (Ball ball: ballslist) {
			g2.fill(ball.getShap());
		}
	}
	private ArrayList<Ball> ballslist = new ArrayList<Ball>();
	
}
