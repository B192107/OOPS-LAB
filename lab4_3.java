class monster{
    String name;
    monster(String name){
        this.name=name;
    }
    String attack(){
        return name;
    }
}
class firemonster extends monster{
    firemonster(String name){
        super(name);
    }
    String attack(){
        return name+" Attack with fire";
    }
}
class watermonster extends monster{
    watermonster(String name){
        super(name);
    }
    String attack(){
        return name+" Attack with water";
    }
}
class stonemonster extends monster{
    stonemonster(String name){
        super(name);
    }
    String attack(){
        return name+" Attack with stones";
    }
}

public class lab4_3 {
    public static void main(String[] args) {
        firemonster f=new firemonster("venkatesh");
        monster m=f;
        System.out.println(m.attack());

        watermonster w=new watermonster("rakesh");
        monster m1=w;
        System.out.println(m1.attack());

        stonemonster s=new stonemonster("abhi");
        monster m2=s;
        System.out.println(m2.attack());
    }
}
