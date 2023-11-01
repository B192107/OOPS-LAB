import java.util.*;

class employee{
	String f_name;
	String l_name;
	
	employee(String f_name,String l_name){
		this.f_name=f_name;
		this.l_name=l_name;
	}
	String getFirstName(){
		return f_name;
	}
	String getLastName(){
		return l_name;
	}
}
class contractEmployee extends employee{

	String department;
	String designation;
	double salary;
	contractEmployee(String f_name,String l_name,String department,String designation,double salary){
		super(f_name,l_name);
		this.department=department;
		this.designation=designation;
		this.salary=salary;
	}
	String displayFullName(){
		return f_name+" "+l_name;
	}
	String getDepartment(){
		return department;
	}
	String getDesig(){
		return designation;
	}
	double printSalary(){
		return salary;
	}
}
class regularEmployee extends employee{
	
	String department;
	String designation;
	double salary;
	regularEmployee(String f_name,String l_name,String department,String designation,double salary){
		super(f_name,l_name);
		this.department=department;
		this.designation=designation;
		this.salary=salary;
	}
	String displayFullName(){
		return f_name+" "+l_name;
	}
	String getDepartment(){
		return department;
	}
	String getDesig(){
		return designation;
	}
	double printSalary(){
		return salary;
	}
	
}

class lab6_3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//employee e=new employee();
		
		contractEmployee ce=new contractEmployee("vemula","venkatesh","IT","hr",200000.00);
		System.out.println("full name : "+ce.displayFullName());
		System.out.println("department : "+ce.getDepartment());
		System.out.println("Designation : "+ce.getDesig());
		System.out.println("salary : "+ce.printSalary());
		
		regularEmployee re=new regularEmployee("koyyada","sravan","IT","manager",400000.00);
		System.out.println("full name : "+re.displayFullName());
		System.out.println("department : "+re.getDepartment());
		System.out.println("Designation : "+re.getDesig());
		System.out.println("salary : "+re.printSalary());
		
		
	} 
}
