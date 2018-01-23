/*
 * 
 */
package com.dacian;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pupil p1 = new Pupil();

	}

}

//father class

class Stu
{
	public int age;
	public String name;
	public float fee;
	
	//something don't want to inherita
	//put it private
	
	private String job;
	
	public void printname()
	{
		System.out.println("name "+this.name);
	}
}
//junior student
class Pupil extends Stu
{
	//tuition fee
	public void pay(float fee)
	{
		this.fee=fee;
	}	
}

class Middlestu	extends Stu
{
	//tuition fee
	public void pay(float fee)
	{
		this.fee=fee*0.8f;
	}	
}

class Highstu extends Stu
{
	//tuition fee
	public void pay(float fee)
	{
		this.fee=fee*0.1f;
	}	
}

class Kid extends Pupil
{
	
}
