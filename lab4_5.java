import java.util.*;


class account{
    double balance;
    account(double initialbalance){
        if(initialbalance>=1000.0){
            balance=initialbalance;
        }
        else{
            System.out.println("Initial balance should be greater than 1000");
            balance=0.0;
        }
    }
    void credit(double amount){
        balance+=amount;
    }
    void debit(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Debit amount exceeded account balance");
        }
    }
    double getBalance(){
        return balance;
    }
    void exit(){
        System.out.println("exiting from transaction");
    }
}

public class lab4_5 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String Branch_name;
        int Account_no;
        account a=new account(1200.0);

        System.out.println("Enter the Branch name:");
        Branch_name=sc.next();
        System.out.println("Enter the Account number:");
        Account_no=sc.nextInt();


        char exitchoice;
        do {
            System.out.println("Enter:\n  1 for credit \n  2 for debit \n  3 for getbalance \n  4 for exit");
            int op=sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("enter the amount to be credited:");
                    int amount=sc.nextInt();
                    a.credit(amount);
                    break;
                case 2:
                    System.out.println("enter the amount to be debited:");
                    amount=sc.nextInt();
                    a.debit(amount);
                    break;
                case 3:
                    System.out.println("Balance="+a.getBalance());
                    break;
                case 4:
                    a.exit();                    break;
                default:
                    System.out.println("invalid transaction");
            }
            System.out.println("Do you want to exit(yes/no)?");
            exitchoice=sc.next().charAt(0);
        }while(exitchoice !='Y' && exitchoice !='y');
    }
}
