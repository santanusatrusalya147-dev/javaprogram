class Student
{
	String name;
	int roll;
	double mark;
}
class StudentTest4
{
	public static void main(String arg[])
	{
		Student s=new Student();
		s.name="santanu";
		s.roll=4;
		s.mark=45.50;
		System.out.println("my name="+s.name);
		System.out.println("my roll="+s.roll);
		System.out.println("my mark="+s.mark);
	}
}