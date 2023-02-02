package actualClass;

public class Account {


    private String firstName;
    private String lastName;
    private double balance;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }
    public String getLastName() {
        return this.lastName;
    }

    public void setBalance(double balance) {
        if (balance >= 0.0)
            this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            this.balance = depositAmount + getBalance();
        }
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount < getBalance() && getBalance() >=2000 && withdrawalAmount >= 1000) {
            this.balance = getBalance() - withdrawalAmount;
        }
        System.out.println("withdrawal was successful");
    }
}
