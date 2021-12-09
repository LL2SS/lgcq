package code11__;
import java.util.Date;
import java.util.ArrayList;
public class code11_1 {

	public static void main(String[] args) {
		Account account=new Account("George",1122,1000);
		account.setAnnualInterestRate(1.5);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withDraw(5);
		account.withDraw(4);
		account.withDraw(2);
		System.out.println("账户姓名："+account.getName());
		System.out.println("年利率："+account.getAnnualInterestRate());
		System.out.println("余额："+account.getBalance());
		System.out.printf("%-30s%-12s%-14s%-15s%-30s\n", "交易时间","交易类型","交易金额","账户余额","交易描述");
		ArrayList<Transaction>list=account.getTransactions();
		for(int i=0;i<list.size();i++) {	
			System.out.printf("%-34s%-15c%-18s%-16s%-30s\n",list.get(i).getDateCreated(),list.get(i).getType(),list.get(i).getAmount(),list.get(i).getBalance(),list.get(i).getDescription());
		}
		
	}

}
class Account{
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	private String name;
	private ArrayList<Transaction>transactions=new ArrayList<>();
	public Account() {
		dateCreated=new Date();
	}
	public Account(int id,double balance) {
		this.id=id;
		this.balance=balance;
		dateCreated=new Date();
	}
	public Account(String name,int id,double balance) {
		this.name=name;
		this.id=id;
		this.balance=balance;
		dateCreated=new Date();
	}
	public String getName() {
		return name;
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/1200;
	}
	public double getMonthlyInterest() {
		return balance*this.getMonthlyInterestRate();
	}
	public void withDraw(double amount) {
		balance-=amount;
		transactions.add(new Transaction('W',amount,balance,""));
	}
	public void deposit(double amount) {
		balance+=amount;
		transactions.add(new Transaction('D',amount,balance,""));
	}
}
class Transaction{
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	public Transaction(char type,double amount,double balance,String description) {
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
		date=new Date();
	}
	public Date getDateCreated() {
		return date;
	}
	public char getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return description;
	}
}