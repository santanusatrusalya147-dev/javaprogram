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
class C extends B
{
	
	 void f3()
	 {
	     System.out.println("f2 method ");
	 }

}
class Test
{
	public static void main(String arg[])
	{
	    C ob=new C();
	    ob.f1();
	    ob.f2();
	    ob.f3();
	}
}


