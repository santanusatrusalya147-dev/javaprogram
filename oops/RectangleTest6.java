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
	abstract void perimeter();
}
class Rectangle extends Shape
{
	int length,breath;
	Rectangle(String s, int length,int breadth)
	{
		super(s);
		this.length=length;
		this.breath=breath;
	}
	void area()
	{
		System.out.println("area ="+length*breath);
	}
	void perimeter()
	{
		System.out.println("perimeter="+2*(length+breath));
	}
}
   class RectangleTest6
   {
   	public static void main(String arg[])
   	{
   		Rectangle s=new Rectangle("Rectangle",7,8);
   		s.show();
   		s.area();
   		s.perimeter();

   	}
   }