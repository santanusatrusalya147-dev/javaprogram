class Square
{
	int side;
	Square()
	{
		side=0;
	}

    Square(int side)
    {
    	this.side=side;
    }
     void display()
     {
     	System.out.println("side="+side);
     }
     int Area()
     {
     	return side*side;
     }
     void Perimeter()
     {
     	System.out.println("perimeter="+4*side);
     }
 }
    class SquareTest
    {
    	public static void main(String arg[])
    	{
    		Square r1=new Square(15);
    		r1.display();
    		r1.display();
    		System.out.println("area of square="+r1.Area());
    	}
    }	

