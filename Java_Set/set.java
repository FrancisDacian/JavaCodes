/*
 * show how set works
 */

package com.set;
import java.util.*;
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array list
		ArrayList al=new ArrayList();
		
		Clerk clerk1=new Clerk("jack",50,1000);
		Clerk clerk2=new Clerk("merry",60,2000);
		Clerk clerk3=new Clerk("dacain",100,200000);
		al.add(clerk1);
		al.add(clerk2);
		al.add(clerk3);
		System.out.println("size of al "+al.size());
		
		//Clerk temp=(Clerk)al.get(0);
		
		//System.out.println("fist name is "+temp.getName());
		
		//traversal
		for(int i=0;i<al.size();i++)
		{
			Clerk temp=(Clerk)al.get(i);
			System.out.println("number"+i+" name is "+temp.getName());
		}
		
		al.remove(1);
		System.out.println("delete merry");
		
		for(int i=0;i<al.size();i++)
		{
			Clerk temp=(Clerk)al.get(i);
			System.out.println("number"+i+" name is "+temp.getName());
		}
		
	}

}


class Clerk
{
	
	private String name;
	private int age;
	private float sal;
	
	public Clerk(String name,int age,float sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	
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

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
}
