package com.jpanel;
import java.awt.*;
import javax.swing.*;

public class QQchatpane extends JFrame{
	

	JTextArea jta=null;
	JPanel jp1=null;
	JComboBox jcb=null;
	JTextField jtf=null;
	JButton jb=null;
	JScrollPane jsp=null;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QQchatpane qqcp = new QQchatpane();
	}
	public QQchatpane()
	{		
		jp1 = new JPanel();
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		String []chatter = {"bush","latin"};
		jcb = new JComboBox(chatter);
		jtf = new JTextField(10);
		jb = new JButton("send");
		
		
		//设置布局管理

		
		//加入组件
	
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		//加入到JFrame
		this.add(jsp);
		this.add(jp1,BorderLayout.SOUTH);
		

		
		//设置icon
		this.setIconImage((new ImageIcon("images/qq.png")).getImage());
		//属性
		this.setSize(400,300);
		this.setLocation(500, 500);
		this.setTitle("QQ_chat");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
}
