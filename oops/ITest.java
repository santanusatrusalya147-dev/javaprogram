// interface A
// {
//     void f1();
// }
// interface B
// {
//      void f2();
// }
// class C implements A,B
// {
//     public void f1()
//     {
//     	System.out.println("f1 method ");
//     }
//     public void f2()
//     {
//     	System.out.println("f2 method ");
//     }
// }

// class ITest
// {
//         public static void main(String arg[])
//         {
//         	 A ob=new C();
//         	 ob.f1();
//         	  B obj=new C();
//         	 obj.f2();
//         	 C obj1=new C();
//         	 obj1.f1();
//         	 obj1.f2();
//         }
// }

interface A
{
    void f1();
}
interface B extends A
{
     void f2();
}
class C implements B
{
    public void f1()
    {
        System.out.println("f1 method ");
    }
    public void f2()
    {
        System.out.println("f2 method ");
    }
}

class ITest
{
        public static void main(String arg[])
        {
             A ob=new C();
             ob.f1();
              B obj=new C();
              obj.f1();
             obj.f2();
             C obj1=new C();
             obj1.f1();
             obj1.f2();
        }
}

