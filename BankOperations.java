// 2. Case study : Bank management system
// Define a package bank.
// Include following functionalities as abstract methods in an interface
// abstract XXX credentialsCheck(String Username, String password);
// abstract XXX credit( XXX);
// abstract XXX debit( XXX);
// abstract XXX displayBalance(XXX);
// abstract XXX exit();
// Until user selects exit he can perform any of the above operations.
// Handle the following exceptions during the transaction
// 1. Username and password mismatch. // display error message and continue;
// 2. If debit amount exceeds available balance. // display error message and
// continue;
package bank;

public interface BankOperations {
    public void  credentialsCheck(String username, String password) throws Exception;
    public void credit(double amount);
    public void  debit(double amount) throws Exception;
    public void displayBalance();
    public boolean exit();
}
