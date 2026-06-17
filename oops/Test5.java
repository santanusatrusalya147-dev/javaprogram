class A
{
	A()
	{
	     System.out.println("AC");
	}
}
class B extends A
{  
     B()
     {
        System.out.println("BC");
	
     }
	
}
class Test5
{
	public static void main(String arg[])
	{
	      B ob=new B();
	}
}

