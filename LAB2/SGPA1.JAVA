//SUFIYAN DESAI
import java.util.Scanner;

class Subject
{
	int subjectMarks;
	int credits;
	String grade;
}

class Student 
{	
	String name;
	String usn;
	double SGPA;
	Scanner s;
	Subject subject[];
	Student()
	{
		int i;
		subject = new Subject[9];
		for(i=0;i<9;i++)
			subject[i] = new Subject();
		s = new Scanner(System.in);
	}

	void getStudentDetails()
	{
		System.out.println("enter your name : ");
		name = s.nextLine();
		System.out.println("enter your usn : ");
		usn = s.nextLine();
	}

	void getMarks()
	{
		int i;
		for(i=0;i<8;i++)
		{
			System.out.println("enter the marks and credits for course " + (i+1) + ":");
			System.out.println("marks : ");
			int marks = s.nextInt();
			System.out.println("credits : ");
			int credit = s.nextInt();
			subject[i].subjectMarks = marks;
			subject[i].credits = credit;

			if(marks >= 90 && marks<=100)
			{
				subject[i].grade = "O";
			}
			else if(marks>=80 && marks<90)
			{
				subject[i].grade = "A+";
			}
			else if(marks>=70 && marks<80)
			{
				subject[i].grade = "A";
			}
			else if(marks>=60 && marks<70)
			{
				subject[i].grade = "B+";
			}
			else if(marks>=50 && marks<60)
			{
				subject[i].grade = "B";
			}
			else if(marks>=40 && marks<50)
			{
				subject[i].grade = "C";
			}
			else if(marks>=0 && marks<40)
			{
				subject[i].grade = "F";
			}
		}
	}
	void computeSGPA()
	{
		int i;
		double sgpa;
		double totalcredits = 0;
		double totalgradepoints = 0;
		
		for(i=0;i<8;i++)
		{
			totalcredits += subject[i].credits;
			switch(subject[i].grade)
			{
				case "O" : totalgradepoints += 10*subject[i].credits;
				break;
				case "A+" : totalgradepoints += 9*subject[i].credits;
				break;
				case "A" : totalgradepoints += 8*subject[i].credits;
				break;
				case "B+" : totalgradepoints += 7*subject[i].credits;
				break;
				case "B" : totalgradepoints += 6*subject[i].credits;
				break;
				case "C" : totalgradepoints += 5*subject[i].credits;
				break;
				case "F" : totalgradepoints += 0*subject[i].credits;
				break;
			}
		}
		sgpa = totalgradepoints/totalcredits;
		System.out.println("the sgpa is : "+sgpa);
	}
}
class sgpa
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.getStudentDetails();
		s1.getMarks();
		s1.computeSGPA();
	}
}
