/*
 * @author: dacianyu
 * @data:2018.1.1
 * @project:Polymorphism
 */
package com.dacian;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an=new Cat();
		an.cry();
		an=new Dog();
		an.cry();
		Master master = new Master();
		master.feed(new Dog(), new Bone());
		master.feed(new Cat(), new Fish());
	}

}

class Master
{
	//polymorphism
	public void feed(Animal an,Food f)
	{
		an.eat();
		f.showname();
	}
}
class Food
{
	String name;
	public void showname()
	{
		
	}
}

class Fish extends Food
{
	public void showname()
	{
		System.out.println("fish");
	}
}
class Bone extends Food
{
	public void showname()
	{
		System.out.println("bone");
	}
}
class Animal
{

	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void cry()
	{
		System.out.println("don't know");
	}
	
	public void eat()
	{
		System.out.println("don't know");
	}
	
	
}



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

class Dog extends Animal
{
	public void cry()
	{
		System.out.println("wangwang");
	}
	
	public void eat()
	{
		System.out.println("like bone");
	}
	
}
