//dacianyu	
//operator 
//compare bigger number
//2018.01.01


import java.io.*;
public class Operator03
{
	public static void main(String[] args) 
	{
		
/*		
		int a = 2;
		int b = 4;
		if (b%a==0)
		{
			System.out.println("can be devided");
		}else{
			System.out.println("cannot be devided");
		}
		

		int a = 90;
		int b = a++;
		int c = 90;
		int d = ++c;
		System.out.println(a);//91
		System.out.println(b);//90
		System.out.println(c);//91
		System.out.println(d);//91

		int a = 56;
		int b =90;
		a-=34;
		b%=a;
		System.out.println(a);//22
		System.out.println(b);//2
*/		

		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("write the first number");
			//read data from cmd
			String a1 = br.readLine();
			System.out.println("write the second number");
			String a2 = br.readLine();

			//string to float
			float num1 = Float.parseFloat(a1);
			float num2 = Float.parseFloat(a2);
			if (num1>num2)
			{
				System.out.println("first is bigger");
			}
			if (num1==num2)
			{
				System.out.println("same");
			}
			if (num2>num1)
			{
				System.out.println("second is bigger");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
