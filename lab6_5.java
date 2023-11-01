class vehicle{
	String v_no;
	String i_no;
	String color;
	int fuel;
	vehicle(String v_no,String i_no,String color){
		this.v_no=v_no;
		this.i_no=i_no;
		this.color=color;
	}
	void getConsumption(int fuel){
		this.fuel=fuel;
	}
	int DisplayConsumption(){
		return fuel;
	}
}
class twowheeler extends vehicle{
	double mt;
	double avg;
	twowheeler(String v_no,String i_no,String color,double mt,double avg){
		super(v_no,i_no,color);
		this.mt=mt;
		this.avg=avg;
	}
	double maintenance(){
		return mt;
	}	
	double average(){
		return avg;
	}

}
class fourwheeler extends vehicle{
	double mt;
	double avg;
	fourwheeler(String v_no,String i_no,String color,double mt,double avg){
		super(v_no,i_no,color);
		this.mt=mt;
		this.avg=avg;
	}
	double maintenance(){
		return mt;
	}	
	double average(){
		return avg;
	}

}

class lab6_5{
	public static void main(String args[]){
		twowheeler tw=new twowheeler("TS 02 A1234","AY245B677T","Silver",55,1200);
		tw.getConsumption(10);
		System.out.println("Fuel consumption=" + tw.DisplayConsumption());
		System.out.println("Maintenance=" + tw.maintenance());
		System.out.println("Average=" + tw.average());
		
		fourwheeler fw=new fourwheeler("TS 02 B1434","AY2434TU677T","Red",20,5000);
		fw.getConsumption(20);
		System.out.println("Fuel consumption=" + fw.DisplayConsumption());
		System.out.println("Maintenance=" + fw.maintenance());
		System.out.println("Average=" + fw.average());
		
	}
}

