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
          super(); //by default avaliable it call parent class zero argument constructor
        System.out.println("BC");
	
     }
	
}
class Test6
{
	public static void main(String arg[])
	{
	      B ob=new B();
	}
}

