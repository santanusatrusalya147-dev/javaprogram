class A
{
	A(int x)
	{
	     System.out.println("AC "+x);
	}
}
class B extends A
{  
     B(int x,int y)
     {
          super(x); 
        System.out.println("BC "+y);
	
     }
	
}
class Test7
{
	public static void main(String arg[])
	{
	      B ob=new B(10,20);
	}
}

