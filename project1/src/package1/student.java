package package1;

public class student 
{
	int age;
	int rollNo;

   public void display1()
   {
    System.out.println("Welcome to all of you.");
   }
   public void display2()
   {
   System.out.println("Automation is very easy. ");
   }
 public static void main(String args[])
 {
 student ob= new student();
 ob.display1();
 ob.display2();
 ob.age= 27;
 ob.rollNo= 1;
		 System.out.println("My age is " + ob.age + ".");
 System.out.println("My rollNo is " + ob.rollNo + ".");
 }
}


