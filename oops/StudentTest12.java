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
class StudentTest12
{
	public static void main(String arg[])
	{
		Student s=new Student();
		s.name="papu";
		s.roll=1;
		s.mark=60.50;
		s.display();
		
		Student s1=new Student();
		s1.name="sudhansu";
		s1.roll=2;
		s1.mark=70.50;
		s1.display();

		Student s2=new Student();
		s2.name="santanu";
		s2.roll=3;
		s2.mark=50.50;
		s2.display();
	}
}