import tvremote.remote;
import tvremote.control;
import java.util.*;

public class buttons{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        control co=new control();
 
        do{
            System.out.println("1- SWITCH ON\n6- SWITCH OFF\n2- STAR SPORTS CHANNEL\n3- NGC CHANNEL\n4- DISCOVERY CHANNEL\n5- STARMOVIES CHANNEL");
        int c=sc.nextInt();
            if(c==1)
                co.son();
               
             else if(c==2)
                co.ssch();
               
             else if(c==3)
                co.nsgch();
                
             else if(c==4)
                co.disch();
                
             else if(c==5)
                co.smch();
                
             else if(c==6)
                co.soff();
               
        }while(co.ison);
    }
}