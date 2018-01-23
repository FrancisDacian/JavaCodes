package Interface;

public class Interfaceandextend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//inherit is only one in java
//interface is complement of inherit

interface Fish
{
	public void swimming();
}
interface Bird
{
	public void fly();
}

class Monkey
{
	int name;
	public void jump()
	{
		System.out.println("monkey can jump");
	}
}

class LittleMonkey extends Monkey implements Fish,Bird
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}
	
}

//final
final class Aaa
{
	final float rate = 3.1415926f;
	//if variable is final,need to give original value
	final public void sendmes()
	{
		System.out.println("send message");
	}
}

//class Bbb extends Aaa
//{
//class cannot be inherited
	//public void sendmes()
	//{
		//cannot change
	//}
//}
