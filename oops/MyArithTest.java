class MyArith
{
	void add(int x)
	{
		int y=3;
		System.out.println("no sum="+(x+y));
	}
	void add()
	{
		int x=2,y=5;
		System.out.println("integer sum="+(x+y));
	}
	int add(int x,int y)
	{
		return x+y;
	}
	void add(double x,double y)
	{
		System.out.println("real sum="+(x+y));
	}
}
      class MyArithTest
      {
      	public static void main(String arg[])
      	{
      		MyArith ar=new MyArith();
      		ar.add();
      		ar.add(2.5,3.5);
      	}
      }