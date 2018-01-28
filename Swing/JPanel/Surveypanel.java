package com.jpanel;
import java.awt.*;
import javax.swing.*;

public class Surveypanel extends JFrame{
	
	JPanel jp1,jp2;
	JLabel j1b1,j1b2;

	JComboBox jcb1;
	JList jlist;
	JScrollPane jsp;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surveypanel sp = new Surveypanel();
	}
	public Surveypanel()
	{
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		j1b1 = new JLabel("country from");
		j1b2 = new JLabel("favorite place");
		
		String []jg= {"china","usa","sg"};
		jcb1 = new JComboBox(jg);
		
		String []area = {"beijing","shanghai","qingdao"};
		jlist = new JList(area);
		//滚动效果
		jlist.setVisibleRowCount(2);
		jsp = new JScrollPane(jlist);
		//设置希望显示多少选项
		
		
		
		//设置布局管理
		this.setLayout(new GridLayout(3,1));
		
		//加入组件
		jp1.add(j1b1);
		jp1.add(jcb1);
		
		jp2.add(j1b2);
		jp2.add(jsp);
		
		
		//加入到JFrame
		this.add(jp1);
		this.add(jp2);

		
		this.setSize(300,300);
		this.setLocation(500, 500);
		this.setTitle("login panel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
}
