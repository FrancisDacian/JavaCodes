package com.jpanel;
import java.awt.*;
import javax.swing.*;

public class Loginpanel extends JFrame{
	
	JPanel jp1,jp2,jp3;
	JLabel j1b1,j1b2;
	JButton jb1,jb2;
	JTextField jtf1;
	JPasswordField jpf1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loginpanel lip = new Loginpanel();
	}
	public Loginpanel()
	{
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		j1b1 = new JLabel("username");
		j1b2 = new JLabel("password");
		
		jb1 = new JButton("login");
		jb2 = new JButton("cancel");
		
		jtf1 = new JTextField(10);
		jpf1 = new JPasswordField(10);
		
		//设置布局管理
		this.setLayout(new GridLayout(3,1));
		
		//加入组件
		jp1.add(j1b1);
		jp1.add(jtf1);
		
		jp2.add(j1b2);
		jp2.add(jpf1);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//加入到JFrame
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setSize(300,150);
		this.setLocation(500, 500);
		this.setTitle("login panel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
}
