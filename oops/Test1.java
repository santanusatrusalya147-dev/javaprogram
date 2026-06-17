class A
{
    void f1()
    {
       System.out.println("f1 method ");
    }
	
}
class B extends A
{
	
	 void f2()
	 {
	     System.out.println("f2 method ");
	 }

}

class Test1
{
	public static void main(String arg[])
	{
	    B ob=new B();
	    ob.f1();
	    ob.f2();
	}
}

