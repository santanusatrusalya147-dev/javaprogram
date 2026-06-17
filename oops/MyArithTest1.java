class MyArith
{
	void show(int x)
	{
		int y=9;
		System.out.println("no sum="+(x+y));
	}
	void show()
	{
		int x=4,y=6;
		System.out.println("integer sum="+(x+y));
	}
	int show(int x,int y)
	{
		return x+y;
	}
	void show(double x,double y)
	{
		System.out.println("real sum="+(x+y));
	}
}
class MyArithTest1
{
	public static void main(String arg[])
	{
		MyArith ar=new MyArith();
		ar.show();
		ar.show(5.7,9.7);
	}
}
