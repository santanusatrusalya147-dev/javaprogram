class Student
{
    String name;
    int roll;
    double mark;
    void display()
    {
  	System.out.println("my name="+this.name);
  	System.out.println("my roll="+this.roll);
  	System.out.println("my mark="+this.mark);
  	}

}
	class StudentTest2
	{
		public static void main(String arg[])
		{
			Student s=new Student();
			s.name="babul";
			s.roll=2;
			s.mark=98.50;
			s.display();

			Student s1=new Student();
			s1.name="chinu";
			s1.roll=3;
			s1.mark=96.50;
			s1.display();

		}
	}
