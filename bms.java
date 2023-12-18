package bank;

public interface bms{
    public void credentialsCheck(String username,String password) throws InvalidcredentialsException;
    public void credit(double amount);
    public void debit(double amount) throws InsufficientBalanceException;
    public void displaybal();
    public void exit();
} 