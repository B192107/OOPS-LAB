package tvremote;

public class control implements remote{
    public boolean ison;
    public control(){
        this.ison=false;
    }
    public void son(){
        ison=true;
        System.out.println("welcome to tata sky");
    }
    public void soff(){
        ison=false;
        System.out.println("tv is switched off");
    }
    public void ssch(){
        if(ison==true){
            System.out.println("star sports channel");
        }
        else{
            System.out.println("turn on tv");
        }
    }
     public void nsgch(){
        if(ison==true){
            System.out.println("nsg channel");
        }
        else{
            System.out.println("turn on tv");
        }
    }
     public void disch(){
        if(ison==true){
            System.out.println("disc channel");
        }
        else{
            System.out.println("turn on tv");
        }
    }
     public void smch(){
        if(ison==true){
            System.out.println("sm channel");
        }
        else{
            System.out.println("turn on tv");
        }
    }
}