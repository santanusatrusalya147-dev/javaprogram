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
class StudentTest11
{
	public static void main(String arg[])
	{
		Student s=new Student();
		s.name="linga";
		s.roll=3;
		s.mark=85.50;
		s.display();

		Student s1=new Student();
		s1.name="banti";
		s1.roll=4;
		s1.mark=86.50;
		s1.display();
	}
}