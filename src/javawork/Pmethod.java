package javawork;

public class Pmethod 
{
	public void demo(float x )
	{
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		Pmethod obj = new Pmethod();
			obj.demo('b');     //it is going to char to int
			obj.demo(10);
			//obj.demo(25.56);   // it is going to double to int its not possible
			//obj.demo();
		

	}

}
