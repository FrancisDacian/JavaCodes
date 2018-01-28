/*
 * 流式布局
 * FlowLayout
 */
package com.jframe;
import java.awt.*;
import javax.swing.*;
public class Jframe3 extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jframe3 jframe3 = new Jframe3();
	}
	public Jframe3()
	{
		jb1 = new JButton("11");
		jb2 = new JButton("22");
		jb3 = new JButton("33");
		jb4 = new JButton("44");
		jb5 = new JButton("55");
		jb6 = new JButton("66");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		this.setTitle("FlowLayout");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		//不允许用户改变窗体大小
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
	}

}
