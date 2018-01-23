
/*
 * @author:dacian
 * @data:2018.1.1
 * @project:Joseph problem
 */
package com.dacian;
public class Joseph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cyclink cyclink = new Cyclink();
		cyclink.setlen(5);
		cyclink.setk(5);
		cyclink.setm(5);	
		cyclink.createLink();
		cyclink.show();
		cyclink.play();
	}

}

class Child
{
	int no;
	Child nextChild = null;

	public Child(int no)
	{
		this.no=no;
	}
}
class Cyclink
{
	//first one cannot change
	Child firstChild=null;
	Child temp = null;
	int len=0;
	int k=0;
	int m=0;
	
	public void setlen(int len)
	{
		this.len=len;
	}
	public void setk(int k)
	{
		this.k=k;
	}
	public void setm(int m)
	{
		this.m=m;
	}
	public void play()
	{
		Child temp=this.firstChild;
		for(int i=1;i<k;i++)
		{
			temp=temp.nextChild;
		}
		
		while(this.len!=1) {
		for(int j=1;j<m;j++)
		{
			temp=temp.nextChild;
		}
		Child temp2=temp;
		while(temp2.nextChild!=temp)
		{
			temp2=temp2.nextChild;
		}
		temp2.nextChild=temp.nextChild;
		temp=temp.nextChild;
		this.len--;
		}
		
		System.out.println(temp.no);
	}
	public void createLink()
	{
		for(int i=1;i<=len;i++)
		{
			if(i==1) {
				Child ch = new Child(i);
				this.firstChild=ch;
				this.temp=ch;
			}else
			{
				if(i==len) {
					Child ch=new Child(i);
					temp.nextChild=ch;
					temp=ch;
					temp.nextChild=this.firstChild;
				}else {
					Child ch = new Child(i);
					temp.nextChild=ch;
					temp=ch;
				}
				
			}
			
			
			
		}
	}
	public void show()
	{
		Child temp=this.firstChild;
		do {
			System.out.println(temp.no);
			temp=temp.nextChild;
		}while(temp!=this.firstChild);
	}
}
