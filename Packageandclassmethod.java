//dacianyu
//Packageandclassmethod
//2018.1.1


public class Packageandclassmethod
{
	/*static int i=1;
	//this static area is only ran once
	static
	{
		i++;
	}
	public Packageandclassmethod()
	{
		i++;
	}

	public static void main(String[] args) 
	{
		Packageandclassmethod t1 = new Packageandclassmethod();
		System.out.println(t1.i);//3
		Packageandclassmethod t2 = new Packageandclassmethod();
		System.out.println(t2.i);//4
	}*/
	public static void main(String[] args) 
	{
		Stu stu1 = new Stu(20,"a",300);
		Stu stu2 = new Stu(25,"b",500);

		System.out.println("totalfee="+Stu.gettotalfee());

		Clark c1=new Clark("jack",24,4875.5f);
		
		System.out.println("name is "+c1.name+"salary is "+c1.getsal());

	}

}


class Stu
{
	int age;
	String name;
	int fee;
	static int totalfee;

	public Stu(int age,String name,int fee)
	{
		this.age=age;
		this.name=name;
		totalfee+=fee;
	}
	//this is a class method/static method
	//static method cannot vist non-static varibles
	//non-static method can visit static varibles
	public static int gettotalfee()
	{
		return totalfee;
	}
}

class Clark
{
	public String name;
	private int age;
	private float salary;
	public Clark(String name,int age,float salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	//througe a member method to visit private variables

	public float getsal()
	{
		return this.salary;
	}
}