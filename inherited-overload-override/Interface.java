/*
 * @author: dacian
 * @data:2018.1.1
 * @project: interface
 */
package Interface;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Usb.a);
		Computer computer = new Computer();
		Camera camera = new Camera();
		Phone phone = new Phone();
		computer.useUsb(camera);
		computer.useUsb(phone);
	}

}

interface Usb
{
	public void start();
	public void stop();
	int a=1;
	//variable need to be initialized
	//must be static
	//cannot use private public
	//cannot extends other class
	//but can extends other interface
	
}
interface Usb2
{
	public void cry();
	
}
//when a class implements a interface, 
//need to accomplish all the method
//cannot have main body
//more abstract than abstract
//can have more than one interface
class Camera implements Usb,Usb2
{
	public void start() {
		System.out.println("camera starts to work");
	}
	
	public void stop() {
		System.out.println("camera stops working");
	}
	public void cry() {
		
	}
}

class Phone implements Usb
{
	public void start() {
		System.out.println("phone starts to work");
	}
	
	public void stop() {
		System.out.println("phone stops working");
	}
}

class Computer
{
	public void useUsb(Usb usb) {
		usb.stop();
		usb.start();
	}
}
