// Java code for thread creation by extending 
// the Thread class 
class Multithreading extends Thread 
{ 
	public void run() 
	{ 
		try
		{ 
			// Displaying the thread that is running 
System.out.println ("\t\tThread " + " is running"); 

		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

// Main Class 
public class ExampleMultithread
{ 
	public static void main(String[] args) 
	{ 
		
			Multithreading object = new Multithreading(); 
			object.start(); 
		 
	} 
} 
