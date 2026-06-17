class Student
{
	String name;
	int roll;
	double mark;
	Student(String n,int r,double m)
	{
		this.name=n;
		this.roll=r;
		mark=m;
	}
	void display()
	   {
		System.out.println("my name="+this.name);
		System.out.println("my roll="+this.roll);
		System.out.println("my mark="+mark);
		 }
 }
	class StudentTest3
	{
		public static void main(String arg[])
		{
			Student s=new Student("santanu",2,78.50);

			s.display();

			Student s1=new Student("ram",3,80.50);

			s1.display();
			Student s2=new Student("babul",4,87.50);

			s2.display(); 
		}
	}	