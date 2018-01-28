//
//borderlayout
//1.继承jframe
//2.定义各个组件
//3.创建组件
//4.添加组件
//5.设置窗体
//6。显示窗体
package com.jframe;
import java.awt.*;
import javax.swing.*;
//
public class Jframe2 extends JFrame{
	
	JButton jb1,jb2,jb3,jb4,jb5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jframe2 jframe2 = new Jframe2();
	}
	
	public Jframe2()
	{
		jb1 = new JButton("middle");
		jb2 = new JButton("north");
		jb3 = new JButton("east");
		jb4 = new JButton("south");
		jb5 = new JButton("west");
		
		//添加组件
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.EAST);
		this.add(jb4,BorderLayout.SOUTH);
		this.add(jb5,BorderLayout.WEST);
		
		//设置窗体属性
		this.setTitle("border-layout");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
		
	}

}
