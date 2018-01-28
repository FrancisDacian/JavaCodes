/*
 * 单选与复选框
 */
package com.jpanel;
import java.awt.*;
import javax.swing.*;

public class Loginapanel2 extends JFrame{
	
	JPanel jp1,jp2,jp3;
	JLabel j11,jl2;
	JButton jb1,jb2;
	JCheckBox jcb1,jcb2,jcb3;
	//可以多选
	JRadioButton jrb1,jrb2;
	//房间一个group只能选一个
	ButtonGroup bg;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loginapanel2 lip = new Loginapanel2();
	}
	public Loginapanel2()
	{
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		j11 = new JLabel("sport like");
		jl2 = new JLabel("gender");
		
		jb1 = new JButton("log on");
		jb2 = new JButton("cancel");
		
		jcb1 = new JCheckBox("football");
		jcb2 = new JCheckBox("basketball");
		jcb3 = new JCheckBox("baseball");

		jrb1 = new JRadioButton("man");
		jrb2 = new JRadioButton("female");
		//把两个放进一个group里面
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		

		
		//设置布局管理
		this.setLayout(new GridLayout(3,1));
		
		//加入组件
		jp1.add(j11);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
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
