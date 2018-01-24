package arrey;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,7,12,15};
		BinaryFind bf = new BinaryFind();
		bf.find(0, arr.length-1, 7, arr);

	}
}

class BinaryFind
{
	public void find(int leftindex,int rightindex,int val,int arr[])
	{
		int midindex=(rightindex+leftindex)/2;
		int midval=arr[midindex];
		
		if(rightindex>=leftindex) 
		{
			if(midval>val)
			{
				find(leftindex,midindex-1,val,arr);
			}else if(midval<val)
			{
				find(midindex+1,rightindex,val,arr);
			}else if(midval==val)
			{
				System.out.println("find it"+midindex);
			}
		}
	}
}
