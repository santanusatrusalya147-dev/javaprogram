interface Shape
{
	void area();//public abstract void area();

}
class Square implements Shape
{
	int side;
	Square(int side)
	{
		this.side=side;
	}
	public void area()
	{
		System.out.println("area of square="+side*side);
	}

}
class Rectangle implements Shape
{
	int L,B;
	Rectangle(int L,int B)
	{
		this.L=L;
		this.B=B;
	}
	public void area()
	{
		System.out.println("area of rectangle="+L*B);
	}
}
class InterfaceSquare
{
	public static void main(String arg[])
	{
		Shape s=new Square(7);
		s.area();
		Shape r=new Rectangle(7,8);
		r.area();
	}
}