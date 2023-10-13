package javawork;

public class Methods_Prac 
{
	public void addition_1(int x , int y)
	{
		System.out.println(x+y);
	}
	public void addition_2(double d, double e)
	{
		System.out.println( d+e);
	}
	public void addition_3(String s)
	{
		System.out.println("this is string arg method");
	}

	public static void main(String[] args) 
	{
		Methods_Prac obj = new Methods_Prac();
		obj.addition_1(30, 20);
		//System.out.println("the number is");
		obj.addition_2(2.50,5.20);
		obj.addition_3("xyz ");

	}

}
