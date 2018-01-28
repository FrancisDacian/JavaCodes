package com.genericdemo;

import java.lang.reflect.Method;

//泛型
//安全
//提高重用率
//向后兼容
public class Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gen<String> gen1 = new Gen<String>("aaa");
		//Gen<Integer> gen2 = new Gen<Integer>(2);
		Gen<Bird> gen3 = new Gen<Bird>(new Bird());
		//gen1.showTypeName();
		//gen2.showTypeName();
		gen3.showTypeName();
	}

}
class Bird
{
	public void test1() {
		System.out.println("aa");
	}
	public void count(int a, int b) {
		System.out.println(a+b);
	}
}

class Gen<T>
{
	private T o;
	
	//构造函数
	public Gen(T a)
	{
		o=a;
	}
	//得到T的类型名称
	public void showTypeName() {
		System.out.println("Type is "+o.getClass().getName());
		//通过反射机制，我们可以得到T的很多性质
		//比如得到成员函数名
		Method []m=o.getClass().getDeclaredMethods();
		for(int i=0;i<m.length;i++)
		{
			System.out.println("name is: "+m[i].getName());
		}
	}
}
