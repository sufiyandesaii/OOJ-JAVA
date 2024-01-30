import java.util.Scanner;

class WrongAge extends Exception 
{
 public WrongAge(String message) 
 {
  super(message);   
 }
}

class InputScanner 
{
 protected Scanner s;
 public InputScanner() 
 {
  s = new Scanner(System.in);
 }
}


class Father extends InputScanner
{
 protected int fatherAge;
 public Father() throws WrongAge
 {
  System.out.println("Enter Father's Age:");
  fatherAge=s.nextInt();

  if(fatherAge<0)
  {
   throw new WrongAge("Age cannot be negetive:");
  }
 }

 public void display()
 {
  System.out.println("Father's Age:" + fatherAge);
 }

}


class Son extends Father
{
 private int sonAge;
 
 public Son() throws WrongAge
 {
  super();
  System.out.println("Enter Son's age:");
  sonAge=s.nextInt();
  

  if(sonAge>fatherAge)
  {
   throw new WrongAge("Son's age cannot be greater than father's age");
  } 
  else if (sonAge<0) 
  {
   throw new WrongAge("Age cannot be negative");
  }
 }

 public void display() 
 {
  super.display(); 
  System.out.println("Son's Age: " + sonAge);
 }

}


public class FatherSonAge
{
 public static void main(String args[])
 {
  try
  {
   Son son=new Son();
   son.display();
  }

  catch (WrongAge e) 
  {
   System.out.println("Error: " + e.getMessage());
  }
 }

}
  