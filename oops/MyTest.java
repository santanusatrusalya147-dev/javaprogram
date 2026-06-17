class Parent
{
	void property()
	{
		System.out.println("land+gold +money");
	}
	void marry()//overrideen
	{
		System.out.println("child must marry gita");
	}

}
class Child extends Parent
{
	void marry()//overriding
	{
		System.out.println("sita");
	}
}
class MyTest
{
	public static void main(String arg[])
	{
		Child c=new Child();
		c.property();
		c.marry();
	}
}