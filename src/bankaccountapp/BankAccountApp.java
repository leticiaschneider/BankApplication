package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		 Checking check1 = new Checking("Lety", "23233221", 1500);
		 Savings saving1 = new Savings("Rich Lowe", "3232222", 2500);
		 
		 saving1.showInfo();
		 System.out.println("*********");
		 check1.showInfo();
	}

}
