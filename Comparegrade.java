//dacianyu
//comparegrade
//2018.1.1

import java.io.*;
public class Comparegrade
{
	public static void main(String[] args)  throws Exception
	{
		String str;
		int a ;
		BufferedReader buf;

		buf=new BufferedReader(new InputStreamReader(System.in));
		str = buf.readLine();
		a = Integer.parseInt(str);

		switch (a)
		//byte short int char enum
		{
		case 100:
			System.out.println("great");
		break;
		case 80:
			System.out.println("good");
		break;
		case 70:
			System.out.println("ave");
		break;
		case 60:
			System.out.println("worse");
		break;
		case 0:
			System.out.println("bad");
		break;
		default:
			System.out.println("error");
		break;
		}

	}
}
