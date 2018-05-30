package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("465332335", 1000);
		BankAccount acc2 = new BankAccount("224233445", 2000);
		
		acc1.setName("Jim");
		acc2.setName("Pam");
		System.out.println(acc1.getName());
		
		acc1.payBill(100);
		acc1.deposit(200);
		System.out.println(acc2.toString());
	}

}

class BankAccount implements IIntrest {
	// Properties of a bank account
	private static int ID = 1001;
	private String accountNumber;	//ID + random 2 digit number + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	//Construnctor
	public BankAccount(String SSN, double initDeposit) {
		 balance = initDeposit; 
		 System.out.println("New Account Created");
		 this.SSN = SSN;
		 ID++;
		 setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number: "+accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void payBill(int amount) {
		balance -= amount;
		showBalance();
	}
	public void deposit(int amount) {
		balance += amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: "+balance);
	}
	public void accureIntrest() {
		
	}

	@Override
	public void accure() {
		balance = balance *(1 * rate/100);
		showBalance();		
	}
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: :" + accountNumber + " ]\n[Routing number: " + routingNumber  + " ]\n[Balance: " + balance + "]";
		
	}
}