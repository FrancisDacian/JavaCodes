package com.exceptionhandling;

import java.io.FileReader;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Father();
		father.test1();
	}

}


class Father
{
	private Son son = null;
	public Father()
	{
		son=new Son();
		
	}
	public void test1()
	{
		System.out.println("father");
		try {
			son.test2();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			e.printStackTrace();
		}
	
	}
}

class Son
{
	public void test2() throws Exception
	{
		FileReader fr = null;
		fr = new FileReader("d:\\dd.txt");
		
	}
}
