package com.dacian;
import javax.swing.*;
public class Demo2 extends JFrame{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Demo2 demo2 = new Demo2();
		Abc abc1 = new Abc();
		System.out.println(abc1.getmax(10, 11));
		
	}
/*	public Demo2()
	{
		this.setVisible(true);
		this.setSize(200,200);
	}*/

}

//overload
class Abc
{
	public int getmax(int i,int j)
	{
		if(i>j)
		{
			return i;
		}
		else {
			return j;
		}
	}
	public float getmax(float a,float b)
	{
		if(a>b)
		{
			return a;
		}
		else {
			return b;
		}
	}
}
