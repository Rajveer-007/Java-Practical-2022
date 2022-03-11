import java.util.*;
class BankAccount{
	int balance;
	String name;
	int acc_no = 0;
	String acc_type;
	Scanner in = new Scanner(System.in);

	BankAccount(int i){
		acc_no = i;	
		balance = 0;	
	}
	void createAcc(){
		System.out.println("Enter your name: ");
		name = in.next();
		System.out.println("Enter Account Type: ");
		acc_type = in.next();
		System.out.println("Account created successfully!");
	}
	void Deposit(){
		int rs;
		System.out.println("Enter the Amount which you want to Deposit: ");
		rs = in.nextInt();	
		balance += rs;
		System.out.println("Amount Deposited Successfully!");
	}
	void Withdraw(){
		int rs;
		System.out.println("Enter the Amount which you want to Withdraw: ");
		rs = in.nextInt();	
		balance -= rs;
		System.out.println("Amount Withdrawed Successfully!");
	}
	void BalanceInquiry(){
		System.out.println("Balance = " +balance);
	}
}
class BankAcc1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int objnum;
		System.out.println("Enter the account you want to create: ");
		int accnum = in.nextInt();
		BankAccount b[] = new  BankAccount[accnum];
		int i = 0;
		int ch = 0;
			while(ch!=5){
				System.out.println("Account Operations : \n1) Create Account, \n2) Deposit, \n3) Withdraw, \n4) BalanceInquiry \n5) Exit");
				System.out.println("Enter your choice: ");
				ch = in.nextInt();
				switch(ch){
					case 1:
						if(i<accnum){ 
							int j = i + 1;
							b[i] = new BankAccount(j);
							b[i].createAcc();
							i = i + 1;
						}
					break;
					case 2: 
						System.out.println("Enter the account num in which you want to deposit Amount: ");
						objnum = in.nextInt();
						objnum = objnum - 1;
						b[objnum].Deposit();
					break;
					case 3:
						System.out.println("Enter the account num in which you want to Withdraw Amount: ");
						objnum = in.nextInt();
						objnum = objnum - 1;
						b[objnum].Withdraw();
					break;
					case 4:
						System.out.println("Enter the Account num which balance you want to know: ");
						objnum = in.nextInt();
						objnum = objnum - 1;
						b[objnum].BalanceInquiry();
					break;	
				}
			}			
	}
}
