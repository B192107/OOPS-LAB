import java.util.*;

class ContractEmployee{
	ContractEmployee(){
	}
}

class HourlyEmployee extends ContractEmployee{
	int no_of_hrs;
	double wages;
	HourlyEmployee(int no_of_hrs,double wages){
		this.no_of_hrs=no_of_hrs;
		this.wages=wages;
	}
	double calculateWages(){
		return no_of_hrs*wages;
	}
	void getDesig(){
		System.out.println("Hourly Employee");
	}
}
class WeeklyEmployee extends ContractEmployee{
	int no_of_wks;
	double wages;
	WeeklyEmployee(int no_of_wks,double wages){
		this.no_of_wks=no_of_wks;
		this.wages=wages;
	}
	double calculateWages(){
		return no_of_wks*wages;
	}
	void getDesig(){
		System.out.println("Weekly Employee");
	}
}

class lab6_4{
	public static void main(String args[]){
		HourlyEmployee he=new HourlyEmployee(130,200);
		System.out.println("Monthly salary of hourly employee : " + he.calculateWages());
		he.getDesig();
		
		WeeklyEmployee we=new WeeklyEmployee(3,12000);
		System.out.println("Monthly salary of Weekly employee : " + we.calculateWages());
		we.getDesig();
	}
}
