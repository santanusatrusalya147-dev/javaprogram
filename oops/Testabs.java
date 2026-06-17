abstract class Shape
{
	String s;
	Shape(String s)
	{
		this.s=s;
	}
	void show()
	{
		System.out.println("shape "+s);
	}
	abstract void area();
}
class Square extends Shape
{
	int side;
	Square(String s,int side)
	{
		super(s);
		this.side=side;
	}
	void area()
	{
		System.out.println("area ="+side*side);
	}

}
   class Testabs
   {
   	public static void main(String arg[])
   	{
   		Shape s=new Square("sq",5);
   		s.show();
   		s.area();
   	}
   }