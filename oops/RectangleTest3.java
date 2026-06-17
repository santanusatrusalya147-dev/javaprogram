class Rectangle
{
	int len,bre;
	Rectangle()
	{
		len=0;
		bre=0;
	}
	Rectangle(int len,int bre)
	{
		this.len=len;
		this.bre=bre;
	}
	void display()
	{
		System.out.println("length="+len);
		System.out.println("breath="+bre);
	}
	int area()
	{
		return len*bre;
	}
	void Perimeter()
	{
		System.out.println("perimeter="+2*(len+bre));
	}
}
class RectangleTest3
{
	public static void main(String arg[])
	{
		Rectangle r1=new Rectangle(5,9);
		r1.display();
		r1.display();
		System.out.println("area of rectangle="+r1.area());
	}
}