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
	String type;
	String name;
	twowheeler(String v_no,String i_no,String color,double mt,double avg,String type,String name){
		super(v_no,i_no,color);
		this.mt=mt;
		this.avg=avg;
		this.type=type;
		this.name=name;
	}
	double maintenance(){
		return mt;
	}	
	double average(){
		return avg;
	}
	String getType(){
		 return type;
	}
	String getName(){
		return name;
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
class geared extends twowheeler{
	
	geared(String v_no,String i_no,String color,double mt,double avg,String type,String name){
	super(v_no,i_no,color,mt,avg,type,name);
	}
	double average(){
		return avg;
	}
}
class nongeared extends twowheeler{

	nongeared(String v_no,String i_no,String color,double mt,double avg,String type,String name){
	super(v_no,i_no,color,mt,avg,type,name);

	}
	double average(){
		return avg;
	}
	
}

class lab6_6{
	public static void main(String args[]){
		twowheeler tw=new twowheeler("TS 02 A1234","AY245B677T","Silver",55,1200,"geared","toyota");
		tw.getConsumption(10);
		System.out.println("Fuel consumption=" + tw.DisplayConsumption());
		System.out.println("Maintenance=" + tw.maintenance());
		System.out.println("Average=" + tw.average());
		
		fourwheeler fw=new fourwheeler("TS 02 B1434","AY2434TU677T","Red",20,5000);
		fw.getConsumption(20);
		System.out.println("Fuel consumption=" + fw.DisplayConsumption());
		System.out.println("Maintenance=" + fw.maintenance());
		System.out.println("Average=" + fw.average());
		
		geared g=new geared("tdkafj1773","3795jew1","white",12,3435,"geared","toyota");
		g.average();
		g.getType();
		g.getName();
		System.out.println("Geared Average=" + g.average());
		nongeared ng=new nongeared("tdk1773","de34ew1","rres",10,1735,"non-geared","bmw");
		ng.average();
		ng.getType();
		ng.getName();
		System.out.println("Non-Geared Average=" + ng.average());
	}
}

