class A
{
	A(int x)
	{
	     System.out.println("AC "+x);
	}
	A()
	{
	    System.out.println("AZC");
	}
}
class B extends A
{  
     B(int x,int y)
     {
          super(x); 
        System.out.println("BC "+y);
	
     }
	  B()
	{
	     super(); //by default
	    System.out.println("BZC");
	}
}
class Test8
{
	public static void main(String arg[])
	{
	     B obj=new B();
	      B ob=new B(10,20);
	}
}


