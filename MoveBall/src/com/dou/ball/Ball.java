/**
 * @author doujianbo
 * @time 2014年5月5日
 * @file Ball.java 
 * a ball that moves and bounces off the edegs of a ranctangle
 */
package com.dou.ball;
import java.awt.geom.*;

public class Ball {
	/*
	 * moves the ball to the next posionm,reversing direcetion if it hits the edges
	 */
	public void move(Rectangle2D bounds)
	{
		x += dx;
		y += dy;
		if (x < bounds.getMinX()) {
			x = bounds.getMinX();
			dx = -dx;
		}
		if (x + X_SIZE >= bounds.getMaxX()) {
			x = bounds.getMaxX() - X_SIZE;
			dx = -dx;
		}
		if (y < bounds.getMinY()) {
			y = bounds.getMinY();
			dy = -dy;
		}
		if (y + Y_SIZE >= bounds.getMaxY()) {
			y = bounds.getMaxY() - Y_SIZE;
			dy = -dy;
		}
		
	}
	public Ellipse2D getShap()
	{
		return new Ellipse2D.Double(x, y, X_SIZE, Y_SIZE);
	}
	private static final int X_SIZE = 15;
	private static final int Y_SIZE = 15;
	private double x = 0;
	private double y = 0;
	private double dx = 1;
	private double dy = 1;
}
