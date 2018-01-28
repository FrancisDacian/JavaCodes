package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//发生异常直接处理
//将异常交给调用者，让调用者处理
//throwable
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//检查异常1.打开文件
		FileReader fr = null;
		try {
			fr = new FileReader("d:\\aa.txt");
			//检查异常1.连接一个192.168.12.12 ip的地址 端口4567
			//在出现异常的地方，就终止执行代码
			//如果有多个catch语句，就进入匹配的那个catch语
			Socket s = new Socket("192.168.1.23",78);
		} catch (Exception e) {
			//输出异常信息，利于排查错误
			e.printStackTrace();
			//继续处理
			
		}
		//如果有system.exit()
		//不会执行finally
		finally{
			//不管有没有异常，都会执行
			//一般，把需要关闭的资源关闭
			if(fr!=null)
			{
				try {
					fr.close();
					
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
		}
		System.out.println("ok1");
		
		
		
		//运行异常
		//int a = 4/0;
		//int arr[]= {1,2,3};
		//System.out.println(arr[234]);
		
	}

}
