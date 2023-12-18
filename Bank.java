 import bank.bms;
 import bank.InsufficientBalanceException;
 import bank.InvalidcredentialsException;
 import java.util.*;

public class Bank implements bms{
    String username;
    String password;
    double bal;
    boolean c=false; 
   
    public Bank(String username,String password,double bal){
        this.username=username;
        this.password=password;
        this.bal=bal;
    }
    public void credentialsCheck(String U,String p) throws InvalidcredentialsException{
        if(!username.equals(U) || !password.equals(p)){
            throw new InvalidcredentialsException("wrong credentials");
        }
        else{
            c=true;
            System.out.println("Correct!");
        }
    }
    public void credit(double amount){
        bal+=amount;
        System.out.println("amount credited"+bal);
    }
    public void debit(double amount) throws InsufficientBalanceException{
        if(bal<amount){
            throw new InsufficientBalanceException("amount exceeds balance");
        }
        System.out.println("debited");
    }
    public void displaybal(){
        System.out.println(bal);
    }
    public void exit(){
        c=false;
        System.out.println("exitsd");
    }
    public static void main(String args[]){
        Bank b=new Bank("venky","123",572368);
        Scanner sc=new Scanner(System.in);
        try{
            do{
                System.out.println("1 for check\n 2 for credit\n 3 for debit\n 4 for display\n 5 for exit");
                int c=sc.nextInt();
                if(c==1)
            b.credentialsCheck("veny","123");
            else if(c==2)
            b.credit(1288);
            else if(c==3)
            b.debit(5681);
            else if(c==4)
            b.displaybal();
            else if(c==5)
            b.exit();
            }
            while(b.c);
        }
        catch(InvalidcredentialsException | InsufficientBalanceException e){
            System.out.println(e);
        }
    }
}