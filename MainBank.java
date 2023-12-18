package bank;



// import java.util.HashMap;
// import java.util.Map;
// class credintialException extends Exception{
//     public credintialException(String msg){
//         super(msg);
//     }
// }
public class MainBank implements BankOperations {
    String user_name,user_password;
    double balance;
    public MainBank(String un,String up,double amt){
        user_name=un;

        user_password=up;
        balance =amt;

    }


    public void credentialsCheck(String inputUsername, String inputPassword) throws Exception{
        if(!(user_name.equals(inputUsername) && user_password.equals(inputPassword))){
            throw new Exception("incorrect crediantials");
            // return false;

        }
        // return true;
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited: " + amount);
    }

    public void debit(double amount) throws Exception{
        if (amount > balance) {
            System.out.println("Debit amount exceeds available balance.");
            throw new Exception("low amount");
            // return false;


           
        }
        balance -= amount;
        System.out.println("Debited: " + amount);
        // return true;
      
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public boolean exit() {
        return true; // Placeholder for exit condition
    }
}
