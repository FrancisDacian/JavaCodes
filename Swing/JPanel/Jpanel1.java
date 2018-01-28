package com.jpanel;
import java.awt.*;
import javax.swing.*;
public class Jpanel1 extends JFrame{
	
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jpanel1 jpanel1 = new Jpanel1();
	}
	public Jpanel1()
	{
		//jpanel默认是flow-layout
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("a");
		jb2=new JButton("b");
		jb3=new JButton("c");
		jb4=new JButton("d");
		jb5=new JButton("e");
		jb6=new JButton("f");
		
		//设置布局管理器
		
		//添加组件panel
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);

		
		//panel加入JFrame
		this.add(jp1,BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		
		this.setSize(300,150);
		this.setLocation(200, 200);
		this.setVisible(true);
		
	}
}
