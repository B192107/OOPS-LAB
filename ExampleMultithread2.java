// Java program to illustrate 
// how to get name of current 
// executing thread. 
import java.io.*; 

// we can create thread by creating the 
// objects of that class 
class ThreadNaming extends Thread 
{ 
	ThreadNaming(String s){super(s);}
	public void run() 
	{ 
		// getting the current thread 's name. 
		System.out.println("Fetching current thread name.."); 
		System.out.println(Thread.currentThread().getName()); 
	} 
} 

class ExampleMultithread2
{ 
	public static void main (String[] args) 
	{ 
		// creating two threads 
		ThreadNaming t1 = new ThreadNaming("first"); 
		ThreadNaming t2 = new ThreadNaming("second"); 
		
		t1.start(); 
		t2.start(); 
	} 
} 
