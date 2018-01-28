package com.jpanel;
import java.awt.*;
import javax.swing.*;

public class Splitpane extends JFrame{
	

	JLabel jlb1;
	JList jlist;	
	JSplitPane jsp;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Splitpane sp = new Splitpane();
	}
	public Splitpane()
	{
;	
		String []words= {"china","usa","sg"};
		jlist = new JList(words);
		//jlabel可以放入图片
		jlb1 = new JLabel(new ImageIcon("images/images.png"));
		//拆分窗格
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist,jlb1);
	
		//可以变化伸缩
		jsp.setOneTouchExpandable(true);
		//设置布局管理

		
		//加入组件
	
		//加入到JFrame
		this.add(jsp);


		
		this.setSize(400,300);
		this.setLocation(500, 500);
		this.setTitle("ntu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
}
