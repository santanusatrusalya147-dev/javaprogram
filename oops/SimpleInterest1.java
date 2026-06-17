  class SimpleInterest
{
   private double principal,rate,time;
   SimpleInterest()
   {
      principal=0;
      rate=0;
      time=0;
   }
   SimpleInterest(double principal,double rate,double time)
   {
      this.principal=principal;
      this.rate=rate;
      this.time=time;
   }
   void setPrincipal(double principal)
   {
      this.principal=principal;
   }
   void setRate(double rate)
   {
      this.rate=rate;
   }
   void setTime(double time)
   {
      this.time=time;
   }
   double getPrincipal()
   {
      return this.principal;
   }
   double getRate()
   {
      return this.rate;
   }
   double getTime()
   {
      return this.time;
   }
   void display()
   {
      System.out.println("principal="+principal);
      System.out.println("rate="+rate);
      System.out.println("time="+time);
   }
   double si()
   {
      return(principal*rate*time/100);
   }
}
   class SimpleInterest1
   {
      public static void main(String arg[])
      {
         SimpleInterest s1=new SimpleInterest(15000,5,9);
         s1.setPrincipal(20000);
         System.out.println("principal="+s1.getPrincipal());
         s1.display();
         double res=s1.si();
         System.out.println("interset="+res);
      }
   }


