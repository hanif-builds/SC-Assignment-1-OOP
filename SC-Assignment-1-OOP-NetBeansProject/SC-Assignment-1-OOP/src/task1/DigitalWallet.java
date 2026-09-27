package task1;

public class DigitalWallet {

    private String accountHolder;
    private double balance;
    private final String pinCode;

    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.pinCode = pinCode;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (!pinCode.equals(enteredPin)) {
            return false;
        }
        else if (amount > balance) {
            return false;
        }
        else {
            balance -= amount;
            return true;
        }
    }

    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet("Hanif Ullah", 5000.0, "1234");
        System.out.println("Balance: " + wallet.getBalance());
        System.out.println("Withdraw with wrong pin: " + wallet.withdraw(1000, "0000"));
        System.out.println("Withdraw with correct pin: " + wallet.withdraw(1000, "1234"));
        System.out.println("Balance now: " + wallet.getBalance());
    }
}
