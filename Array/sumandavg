/*
 * @author: dacian
 * @date: 2018.1.1
 */
import java.io.*;
public class Array {

	public static void main(String[] args) throws Exception {
		
		//define a array can store 6 number
		/*
		float arr[]=new float[6];
		
		arr[0]=3;
		arr[1]=3.2f;
		arr[2]=3.6f;
		arr[3]=3.3f;
		arr[4]=3.1f;
		arr[5]=3.9f;
		
		float total=0;
		for(int i=0;i<=5;i++)
		{
			total+=arr[i];
		}
		System.out.println("all weight is "+total);
		System.out.println(arr.length);*/
		
		Dog dogs[]=new Dog[4];
		//dogs[0].setName("jack");
		//dogs[0].setWeight(4.5f);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i=0;i<4;i++)
		{
			dogs[i]=new Dog();
			System.out.println("enter the dog's name");		
			String name = br.readLine();
			dogs[i].setName(name);
			System.out.println("enter the dog's weight");
			String s_weight=br.readLine();
			float weight=Float.parseFloat(s_weight);
			dogs[i].setWeight(weight);
		}
		
		float allweight=0;
		for(int i=0;i<4;i++)
		{
			allweight+=dogs[i].getWeight();
		}
		float avgweight=allweight/dogs.length;
		System.out.println("totalweight is "+allweight+"averageweight is "+avgweight);
	}

}

class Dog
{
	private String name;
	private float weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}

