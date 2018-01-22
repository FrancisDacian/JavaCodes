//dacianyu
//integertable
//2018.1.1

/*
     *
	* *
   *   *
  *     *
 * * * * *
*/
public class Integertableopenwork 
{
	public static void main(String[] args) 
	{
		int lay = 10;
		for (int i = 1;i<=lay ;i++ )
		{
			//lay1->3 spaces
			//lay2->2 spaces
			//lay3->1 spaces
			//lay4->0 space
			for (int k = 1;k<=lay-i ;k++ )
			{
				System.out.print(" ");
			}
			//lay1->1 stars
			//lay2->2 stars
			//lay3->2 stars
			//lay4->2 stars
			//lay5->9 stars
			for (int j =1;j<=2*i-1 ;j++ )
			{
				if (i==1||i==lay)
				{
					System.out.print("*");	
				}
				else
				{
					if (j==1||j==2*i-1)
					{
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
	
			}
			System.out.println();
		}
		
	}
}
