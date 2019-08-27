package bank;

public class BankAccount 
{
	
	private int acc_no;
	private String name;
	private int balance;
	private String acc_type;
	private static int totalDeposit;
    private static int totalWithdrawal;
	public void setValues(int a,String b,int c, String d)
	{
		acc_no=a;
		name=b;
		balance=c;
		acc_type=d;
	}
	public BankAccount()
	{}
	public BankAccount(int x,String y,int z)
	{
		acc_no=x;
		name=y;
		balance=z;
	}
	
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public static void displayDetails(BankAccount b)
	{
	      System.out.println(b.acc_no+" "+b.name+" "+b.balance+" "+b.acc_type);
	}
	
	public void withdrawAmount(int w)
	{
		balance=balance-w;
		System.out.println("Updated Balance after withdrawal is: "+balance+ " For account Number "+acc_no);
		totalWithdrawal=totalWithdrawal+w;
		
	}
	public void depositAmount(int d)
	{
		balance=balance+d;
		System.out.println("Updated Balance after depositing is: "+balance+ " For account Number "+acc_no);
		totalDeposit=totalDeposit+d;
		
	}
	
	public static void avgBalance(BankAccount...var){
		
		int total=0;
		
		for(BankAccount b:var){
			total=total+b.balance;
		}
		System.out.println("Average Balance of all accounts is : "+(total/var.length));
	}
	
	public void totDep()
	{
		
	}
	
	public static void main(String...args)
	{
		BankAccount ba1=new BankAccount();
		BankAccount ba2=new BankAccount();
		BankAccount ba3=new BankAccount();
		BankAccount ba4=new BankAccount(104,"Sanjay",12000);
		ba1.setValues(101, "ankit", 5000, "savings");
		ba2.setValues(102, "bhavik", 15000, "savings");
		ba3.setValues(103, "chetan", 25000, "current");
		
		BankAccount.displayDetails(ba1);
		BankAccount.displayDetails(ba2);
		ba1.withdrawAmount(100);
		ba2.withdrawAmount(1000);
		ba1.depositAmount(2500);
		ba1.depositAmount(2500);
		ba2.depositAmount(5300);
		ba3.depositAmount(500);
		BankAccount.avgBalance(ba1,ba2,ba3);
		System.out.println("Total deposited amount by all the accounts is " +totalDeposit);
		System.out.println("Total amount withdrawal by all the accounts is " +totalWithdrawal);
		BankAccount.displayDetails(ba4);
		
		
	}
	


}
