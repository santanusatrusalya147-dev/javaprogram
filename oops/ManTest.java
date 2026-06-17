class Framer
{
	void work()
	{
		System.out.println("you put a borel or water the plant");
	}
	void choose()
	{
		System.out.println("you should put a bore");
	}

}
class Man extends Framer 
{
		void choose()
	{
		System.out.println("i will water the plant");
	}

}
class ManTest
{
	public static void main(String arg[])
	{
	  Man m=new Man();
	  m.work();
	  m.choose();
	}
}