package javawork;

public class M_Gandhi extends Kaba_Gandhi 
{
	public void son()
	{
		System.out.println("kaba gandhi is the father of m gandhi");
	}

	public static void main(String[] args) 
	{
		M_Gandhi obj = new M_Gandhi();
		obj.gandhian();
		obj.son();

	}

}
