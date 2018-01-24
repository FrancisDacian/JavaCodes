/*
 * sorting 
 * dacianyu
 */
package arrey;
import java.util.*;
public class Sequence {

	public static void main(String[] args) {
		
		
		int len=40000;
		int arr1[]=new int[len];
		for(int i=0;i<len;i++)
		{
			int t=(int)(Math.random()*10000);
			arr1[i]=t;
		}
		
		//int arr1[]= {1,6,-1,9,-100,90,89,67};
		
		//Bubble bubble=new Bubble();
		//bubble.sort(arr1);
		
		//Selection selection = new Selection();
		//InsertSort insertsort = new InsertSort();
		
		QuickSort qs = new QuickSort();
		
		//time of system
		Calendar cal=Calendar.getInstance();
		System.out.println("before sorting"+cal.getTime());
		//selection.sort(arr1);
		//insertsort.sort(arr1);
		qs.sort(0, arr1.length, arr1);
		cal=Calendar.getInstance();
		System.out.println("after sorting"+cal.getTime());
		
		//out the results
		/*for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+" ");
		}*/
	}

}


class Bubble
{
	public void sort(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
}

class Selection
{
	public void sort(int arr[])
	{
		int temp=0;
		for(int j=0;j<arr.length-1;j++)
		{
			int min=arr[j];
			int minIndex=j;
			for(int k=j+1;k<arr.length;k++)
			{
				if(min>arr[k])
				{
					min=arr[k];
					minIndex=k;
				}
				
			}
			temp=arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
}


class InsertSort
{
	public void sort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int insertVal=arr[i];
			int index=i-1;
			while(index>0&&insertVal<arr[index])
			{
				arr[index+1]=arr[index];
				index--;
				
			}
			
			arr[index+1]=insertVal;
		}
	}
}

class QuickSort
{
	public void sort(int left,int right,int array[])
	{
		int l=left;
		int r=right;
		int pivot = array[(left+right)/2];
		int temp = 0;
		
		while(l<r) {
			while(array[l]<pivot)
				l++;
			while(array[r]>pivot)
				r--;
			
			if(l>=r)
				break;
			temp=array[l];
			array[l]=array[r];
			array[r]=temp;
			
			if(array[l]==pivot)
				--r;
			if(array[r]==pivot)
				++l;
			
		}
		
		if(l==r) {
			l++;
			r--;
		}
		if(left<r)
			sort(left,r,array);
		if(right>l)
			sort(l,right,array);
	}
}
