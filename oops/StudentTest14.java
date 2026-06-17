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
    class StudentTest14
    {
    	public static void main(String arg[])
    	{
    		Student s=new Student("hari",3,55.98);
    		s.display();
    		Student s1=new Student("kalia",4,77.98);
    		s1.display();
    		Student s2=new Student("motu",5,98.76);
    		s2.display();
    	}
    }