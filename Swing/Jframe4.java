/*
 * 网格布局
 * gridlayout 
 */
package com.jframe;
import java.awt.*;
import javax.swing.*;
public class Jframe4 extends JFrame{
	
	
	int size=9;
	JButton jbs[]=new JButton[size];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jframe4 jframe = new Jframe4();
	}
	public Jframe4()
	{
		for(int i =0;i<9;i++)
		{
			jbs[i]=new JButton(String.valueOf(i));
			
		}
		this.setLayout(new GridLayout(3,3,10,10));
		
		for(int i =0;i<size;i++)
		{
			this.add(jbs[i]);
		}
		
		this.setTitle("Grid-Layout");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		//不允许用户改变窗体大小
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}

}
