/*
 * @author: dacian
 * @data:2018.1.1
 * @project: abstract class
 */
 package com.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal an = new Animal();
		//this is wrong
	}

}
//abstract class
abstract class Animal
{

	String name;
	int age;
	abstract public void cry();
	abstract public void eat();	
}
//when some class's father is abstract class
//need to accomplish all the abstract method
class Cat extends Animal
{
	public void cry()
	{
		System.out.println("miaomiao");
	}
	public void eat()
	{
		System.out.println("like fish");
	}
}
