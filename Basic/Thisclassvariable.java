//dacianyu
//Thisclassvariable
//2018.1.1

//this
//class variables
//class method
//four features
//Package inherited polymorphism abstract

//'this' is used in class defination

//static varible can be visited by every objects


public class Thisclassvariable 
{
	public static void main(String[] args) 
	{
		Dog dog1 = new Dog(2,"whiter");
		Person p1 = new Person(dog1,100,"dacian");
		Person p2 = new Person(dog1,50,"jack");
		p1.showinfo();
		p1.dog.showinfo();


		Child ch1 = new Child(3,"jack");
		ch1.joingame();
		Child ch2 = new Child(4,"marry");
		ch2.joingame();

		System.out.println("total is "+Child.total);

	}
}

class Person
{
	int age;
	String name;
	Dog dog;
	public Person(Dog dog,int age,String name)
	{
		//belong to object rathen than class
		this.age=age;
		this.name=name;
		this.dog=dog;
	}

	public void showinfo()
	{
		System.out.println("name:"+name);
	}
}

class Dog
{
	int age;
	String name;
	public Dog(int age,String name)
	{
		this.age=age;
		this.name=name;
	}

	public void showinfo()
	{
		System.out.println("name of dog is "+this.name);
	}
}

class Child
{
	int age;
	String name;
	static int total = 0;
	//static is belong to everyone
	//can be visited by every object
	public Child(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public void joingame()
	{
		total++;
		System.out.println("a child is coming in");
	}
}
