package com.dou.ball;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
/*
 * shows an animated bouncing ball
 */
public class Bounce {
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable(){
			public void run()
			{
				JFrame frame = new BounceFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		
	}

}
/*
 * 主框架
 */
class BounceFrame extends JFrame
{
	public BounceFrame()
	{
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setTitle("A moving ball");
		component = new BallComponent();
		JPanel buttonJPanel = new JPanel();
		addButton(buttonJPanel, "Start", new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addBall();
			}
			
		});
		addButton(buttonJPanel, "Close", new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		//
		add(buttonJPanel,BorderLayout.SOUTH);
	}
	/**
	 * add a bouncing ball to the panel
	 */
	public void addBall()
	{
		try {
			Ball ball = new Ball();
			component.add(ball);
			for(int i = 1;i <= STEPS;i++)
			{
				ball.move(component.getBounds());
				component.paint(component.getGraphics());
				Thread.sleep(DELAY);
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/**
	 * add a button to this container
	 */
	public void addButton(Container c,String title,ActionListener listener){
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}
	private BallComponent component;
	public static final int DEFAULT_WIDTH = 450;
	public static final int DEFAULT_HEIGHT = 350;
	public static final int STEPS = 1000;
	public static final int DELAY = 3;
	
}