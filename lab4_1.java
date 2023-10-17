import java.util.*;

abstract class shape{
    shape(){
        System.out.print("Area and perimeter of");
    }
    // void getArea(){
    //     System.out.println("Area is");
    // }
    // void getPerimeter(){
    //     System.out.println("Perimeter is");
    // }
    abstract void getArea();
    abstract void getPerimeter();
}
class circle extends shape{
    int r;
    circle(int r){
        this.r=r;
        System.out.println(" circle");
    }
    void getArea(){
        System.out.println(3.14*r*r);
    }
    void getPerimeter(){
        System.out.println(2*3.14*r);
    }
}
class square extends shape{
    int s;
    square(int s){
        this.s=s;
        System.out.println(" square");
    }
    void getArea(){
        System.out.println(s*s);
    }
    void getPerimeter(){
        System.out.println(4*s);
    }
}
class rectangle extends shape{
    int l,b;
    rectangle(int l,int b){
        this.l=l;
        this.b=b;
        System.out.println(" rectangle");
    }
    void getArea(){
        System.out.println(l*b);
    }
    void getPerimeter(){
        System.out.println(2*(l+b));
    }
}
public class lab4_1 {
    public static void main(String[] args) {
        //shape s=new shape();
        circle c=new circle(3);
        c.getArea();
        c.getPerimeter();
        square sq=new square(5);
        sq.getArea();
        sq.getPerimeter();
        rectangle r=new rectangle(2, 3);
        r.getArea();
        r.getPerimeter();
    }
   
}
