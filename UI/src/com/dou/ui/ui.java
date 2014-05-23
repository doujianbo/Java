
package com.dou.ui;
import javax.swing.*;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.*;
import java.awt.Font;

import javax.imageio.*;

import java.io.File;
import java.awt.event.*;

public class ui {
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
				{
					public void run() {
						SimpleFrame frame = new SimpleFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}	
					
				});
	}
}
class SimpleFrame extends JFrame
{
	//get screen dimension
	
	
	public SimpleFrame()
	{
		
		setTitle("DrawTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGH);
		//
		buttonPanel = new JPanel();
		UIManager.LookAndFeelInfo[] infos =  UIManager.getInstalledLookAndFeels();
		for (UIManager.LookAndFeelInfo info : infos) {
			makeButton(info.getName(), info.getClassName());
		}
		add(buttonPanel);
	}
	public void makeButton(String name,final String platName)
	{
		//add button tp panel 
		JButton button = new JButton(name);
		buttonPanel.add(button);
		button.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							UIManager.setLookAndFeel(platName);
							SwingUtilities.updateComponentTreeUI(SimpleFrame.this);
						} catch (Exception e2) {
							// TODO: handle exception
							e2.printStackTrace();
						}
					}
					
				});
	}
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGH = 400;
	private JPanel buttonPanel; 
}
/*class SimpleComponent extends JComponent
{
	 public SimpleComponent() {
		// TODO Auto-generated constructor stub
		 
	}
	public void paintComponent(Graphics g)
	{
		if(img == null ) return ;
		int imageWidth = img.getWidth(this);
		int imageHeight = img.getHeight(this);
		g.drawImage(img, 0, 0, null);
		for(int i = 0 ; i * imageWidth <= getWidth();i++)
			for(int j = 0; j * imageHeight <= getHeight();j++)
				if(i+j>0)
					g.copyArea(0, 0, imageWidth, imageHeight, i*imageWidth,j*imageHeight);
		
		
		
		
		
	}
	private Image img;
}*/