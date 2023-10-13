package javawork;

public class Demo 
{
	public void add()
	{
		//System.out.println("the addition of :" );
		System.out.print(10+20);
	}
	public void sub()
	{
		//System.out.println("the substraction of :");
		System.out.println(20-10);
	}
	public void mul()
	{
		//System.out.println("the multiplication of :");
		System.out.println(10*20);
	}
	public void div()
	{
		//System.out.println("the division of :");
		System.out.println(20/10);
	}

	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		System.out.println("division of :");
		obj.div();
		System.out.println("multiplication of : ");
		obj.mul();
		System.out.println("substraction of :");
		obj.sub();
		System.out.println("addition of : ");
		obj.add();

	}

}
