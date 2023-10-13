package javawork;

public class Var_Assignment 
{
	static int y = 89;       //static variable
	
	int instancevar = 14;    //INSTANCE VARIABLE
	public void local_var()
	{
		int z = 65;  //Local variable
		System.out.println(z);
		
		
	}

	public static void main(String[] args) 
	{
		int x = 55;   //Local variable
		System.out.println(x + " : local variable");
		
		Var_Assignment obj = new Var_Assignment();
		
		obj.local_var();//calling local variable
		System.out.print("local variable : ");
		
		
		System.out.println(" \n");
		System.out.println(obj.instancevar + "  : instance Variable");  //calling instance variable
		
		System.out.println(y + " : static variable");                          // first approach to call static variable
		System.out.println(obj.y + " : static variable ");                     //second approach to call static variable
		System.out.println(Var_Assignment.y + " : static variable");          // third approach to call static variable
        

	}

}
