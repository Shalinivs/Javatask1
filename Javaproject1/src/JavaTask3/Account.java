package JavaTask3;

public class Account {


		private String accountNumber;
		private String accountHolderName;
		private double balance;


		public Account() {
		this.accountNumber = "Unknown";
		this.accountHolderName = "Unknown";
		this.balance = 0.0;
		}


		public Account(String accountNumber, String accountHolderName)
		{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
		}


		public void deposit(double amount)
		{
		if (amount > 0)
		{
		balance += amount;
		System.out.println("Deposited: " + amount);
		}
		else
		{
		System.out.println("Deposit amount must be positive.");
		}
		}

		public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
		balance -= amount;
		System.out.println("Withdrew: " + amount);
		} else if (amount <= 0) {
		System.out.println("Withdrawal amount must be positive.");
		} else {
		System.out.println("Insufficient funds. Cannot withdraw " + amount);
		}
		}


		public void checkBalance()
		{
		System.out.println("Current Balance: " + balance);
		}


		public String getAccountNumber()
		{
		return accountNumber;
		}

		public String getAccountHolderName()
		{
		return accountHolderName;
		}

		public double getBalance()
		{
		return balance;
		}

		public static void main(String[] args)
		{

		Account account1 = new Account();
		account1.deposit(1000);
		account1.withdraw(500);
		account1.checkBalance();


		Account account2 = new Account("123456", "John Doe");
		account2.deposit(2000);
		account2.withdraw(1500);
		account2.checkBalance();
		}

		


	}


