package BankingApp;

public class FirstBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating tim object from class Account
		Account tim = new Account("Tim Statler", "A00001");
		
		//Creating beyonce method from class Account
		Account beyonce = new Account("Beyonce", "B00002");
		beyonce.showMenu();
	}

}
