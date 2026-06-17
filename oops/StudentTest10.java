class Student
{
	String name;
	int roll;
	double mark;
	void display()
	{
		System.out.println("my name="+ this.name);
		System.out.println("my roll="+ this.roll);
		System.out.println("my mark="+ this.mark);
	}

	}
	class StudentTest10
	{
		public static void main(String arg[])
		{
			Student s=new Student();
			s.name="krishna";
			s.roll=5;
			s.mark=76.50;
			s.display();

			Student s1=new Student();
			s1.name="kelu";
			s1.roll=7;
			s1.mark=85.50;
			s1.display();
		}
	}
