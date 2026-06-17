class Student
{
	String name;
	int roll;
	double mark;
}
class StudentTest8
{
	public static void main(String arg[])
	{
		Student s=new Student();
		s.name="babu";
		s.roll=4;
		s.mark=87.50;
		System.out.println("my name="+s.name);
		System.out.println("my roll="+s.roll);
		System.out.println("my mark="+s.mark);

		Student s1=new Student();
		s1.name="deba";
		s1.roll=5;
		s1.mark=88.50;
		System.out.println("my name="+s1.name);
		System.out.println("my roll="+s1.roll);
		System.out.println("my mark="+s1.mark);
	}
}