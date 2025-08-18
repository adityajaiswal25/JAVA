// 1. Encapsulation: accountNumber, balance ko private rakha
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accNo, double initialBalance) {
        this.accountNumber = accNo;
        this.balance = initialBalance;
    }

    // getters (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

// 2. Inheritance: SavingAccount aur CurrentAccount banaye jo BankAccount ko inherit karte hain
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accNo, double initialBalance, double interestRate) {
        super(accNo, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accNo, double initialBalance, double overdraftLimit) {
        super(accNo, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // 3. Polymorphism (overriding withdraw method)
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            // hack: deposit negative amount to reduce balance
            super.deposit(-amount);
            System.out.println("Withdrawn using overdraft: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

// 4. Abstraction: BankOperations interface
interface BankOperations {
    void showDetails();
}

// Implementing abstraction
class AccountDetails implements BankOperations {
    private BankAccount account;

    public AccountDetails(BankAccount acc) {
        this.account = acc;
    }

    @Override
    public void showDetails() {
        System.out.println("Account No: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}

// Main Program
public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("S123", 5000, 5);
        CurrentAccount c1 = new CurrentAccount("C999", 2000, 1000);

        System.out.println("=== Savings Account Transactions ===");
        s1.deposit(2000);
        s1.withdraw(1000);
        s1.addInterest();

        AccountDetails details1 = new AccountDetails(s1);
        details1.showDetails();

        System.out.println("\n=== Current Account Transactions ===");
        c1.deposit(3000);
        c1.withdraw(4500);   // overdraft use karega
        c1.withdraw(2000);   // overdraft exceed karega

        AccountDetails details2 = new AccountDetails(c1);
        details2.showDetails();
    }
}
