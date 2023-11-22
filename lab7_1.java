abstract class shape{
	abstract void getArea();
	abstrat void getVolume();
}
class square extends shape{
	int s;
	square(int s){
		this.s=s;
	}
	void getArea(){
		System.out.println("Area of square=" + s*s);
	}
	void getVolume(){
		System.out.println("volume of square=" + 4*s);
	}
	
}
class circle extends shape{
	int r;
	circle(int r){
		this.r=r;
	}
	void getArea(){
		System.out.println("Area of square=" + 3.14*r*r);
	}
	void getVolume(){
		System.out.println("volume of square=" + 4*s);
	}
	
}
class cube extends shape{
	int s;
	cube(int s){
		this.s=s;
	}
	void getArea(){
		System.out.println("Area of cube=" + 4*s*s);
	}
	void getVolume(){
		System.out.println("volume of cube=" + s*s*s);
	}
	
}
class sphere extends shape{
	int r;
	sphere(int r){
		this.r=r;
	}
	void getArea(){
		System.out.println("Area of sphere=" + 4*3.14.r*r);
	}
	void getVolume(){
		System.out.println("volume of sphere=" + (4/3)*3.14*r*r*r);
	}
	
}
class lab7_1{
	public static void main(String args[]){
		square s=new square(
	} 
}
