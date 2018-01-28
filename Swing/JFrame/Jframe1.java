package com.jframe;
import java.awt.*;
import javax.swing.*;

public class Jframe1 extends JFrame{
	//把需要的swing组建初始化
	JButton jb1 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jframe1 jframe = new Jframe1();
		
	}
	
	public Jframe1() {
		//顶层容器类，可以添加其他swing组件的类
		//JFrame jf = new JFrame();
		//按钮创建
		jb1 = new JButton("Button1");
		
		//按钮添加
		this.add(jb1);
		
		//设置窗口标题
		this.setTitle("hello world");
		//设置窗口尺寸
		
		this.setSize(500,500);
		
		//初始位置
		this.setLocation(100, 200);
		
		//设置当关闭窗口保证jvm也退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示
		this.setVisible(true);
	}
	


}
