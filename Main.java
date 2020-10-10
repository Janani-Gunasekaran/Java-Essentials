//importing package
import java.io.*;
//creating the class Employee
class Employee
{
	//creating three variables name, age, city
	String name = "Saurab",city = "Chennai" ;
	int age = 23;
	//creating a method to display the employee details
	void show_employee_Details()
	{
		System.out.println("The name is " + name);
		System.out.println("The age is " + age);
		System.out.println("The city is " + city);			
	}
}
// creating Main class having the main method to drive the code
class Main
{
	public static void main(String args[])
	{
		//creating the instance(object) of the class Employee
		Employee em = new Employee();
		//calling the method of class Employee using the instance em
		em.show_employee_Details();
	}
}