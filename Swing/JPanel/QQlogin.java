package com.jpanel;
import java.awt.*;
import javax.swing.*;

public class QQlogin extends JFrame{
	
	//north region
	JLabel jl1;
	//south region
	JButton jb1,jb2,jb3;
	JPanel jp1;
	//middle region
	JTabbedPane jtp;//选项卡
	JPanel jp2,jp3,jp4;
	JLabel jl2,jl3,jl4,jl5;
	JTextField jtf;
	JPasswordField jpf;	
	JButton jb4;//清除账号
	JCheckBox jcb1,jcb2;//隐身，记住密码
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QQlogin qqli = new QQlogin();
	}
	public QQlogin()
	{		
		jl2 = new JLabel("QQ号码",JLabel.CENTER);
		jl3 = new JLabel("QQ密码",JLabel.CENTER);
		jl4 = new JLabel("忘记密码",JLabel.CENTER);
		
		jl4.setFont(new Font("宋体",Font.PLAIN,16));//设置字体样式
		jl4.setForeground(Color.blue);
		jl5 = new JLabel("<html><a href='www.qq.com>申请密码保护</a>");
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		jtf = new JTextField();
		jpf = new JPasswordField();
		jb4 = new JButton(new ImageIcon("images/clear.png"));
		
		//复选框
		jcb1 = new JCheckBox("隐身登录");
		jcb2 = new JCheckBox("记住密码");	
		
		
		//north region
		jl1 = new JLabel(new ImageIcon("images/images.png"));
		
		//south region
		jp1 = new JPanel();
		jb1 = new JButton(new ImageIcon("images/login.jpg"));
		jb2 = new JButton(new ImageIcon("images/cancel.png"));
		jb3 = new JButton(new ImageIcon("images/clear.png"));
		
		//middle region
		jtp = new JTabbedPane();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp3.setBackground(Color.RED);
		jp4 = new JPanel();
		jp4.setBackground(new Color(0,0,255));
		
	

		
		//面板加入选项卡组件
		jtp.add("QQ号码", jp2);
		jtp.add("手机号码", jp3);
		jtp.add("电子邮箱", jp4);

		//设置布局管理
		jp2.setLayout(new GridLayout(3,3));
		
		//添加组件
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jp2.add(jl2);
		jp2.add(jtf);
		jp2.add(jb4);
		jp2.add(jl3);
		jp2.add(jpf);
		jp2.add(jl4);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl5);

		
		//加入到JFrame
		this.add(jp1,BorderLayout.SOUTH);
		this.add(jl1,BorderLayout.NORTH);
		this.add(jtp,BorderLayout.CENTER);
	
		//展现组件
		ImageIcon icon = new ImageIcon("qq.png");
		this.setIconImage(icon.getImage());
		this.setSize(1000,1000);
		this.setLocation(500, 500);
		this.setTitle("QQ_chat");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
}
