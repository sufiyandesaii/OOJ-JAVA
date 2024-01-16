import java.util.Scanner;

class inputScanner
{

	protected Scanner s;
	
	public inputScanner()
	{
		s = new Scanner(System.in);
	}
	
	public int getInput(String message)
	{
		System.out.println(message);
		return s.nextInt();
	}
	
	
}

abstract class Shape extends inputScanner
{
	protected int a,b;

	public Shape()
	{
		super();
	}
	
	abstract public void printArea();
}

class Rectangle extends Shape
{
	protected int a,b;
	public Rectangle()
	{
		super();
	}
	
	public void printArea()
	{
		
		a=getInput("Enter the length:");
		b=getInput("Enter the bredth:");
		int area= a*b;
		System.out.println("Area of the Rectangle:" +area);
	}
}

class Triangle extends Shape
{
	protected int a,b;
	public Triangle()
	{
		super();
	}
	
	public void printArea()
	{
		a=getInput("Enter the side1:");
		b=getInput("Enter the side2:");
		double area=0.5*a*b;
		System.out.println("Area of the Triangle:" +area);
	}
	
}

class Circle extends Shape
{
	protected int a;
	public Circle()
	{
		super();
	}
	
	public void printArea()
	{
		a=getInput("Enter the radius:");
		double area=3.14*a*a;
		System.out.println("Area of the Circle:" +area);
		
	}
		
}

public class Shape
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();

		r.printArea();
		t.printArea();
		c.printArea();
	}
}











