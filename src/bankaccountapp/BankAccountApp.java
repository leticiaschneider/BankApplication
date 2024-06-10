package bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file = "/Users/leticiaschneider/eclipse-workspace/BankAccountApp/resources/newBankAccounts.csv";
//		 Checking check1 = new Checking("Lety", "23233221", 1500);
//		 Savings saving1 = new Savings("Rich Lowe", "3232222", 2500);
//		 
//		 saving1.showInfo();
//		 System.out.println("*********");
//		 check1.showInfo();
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			System.out.println("-------------");
			System.out.println("New account");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
		}
	}

}
