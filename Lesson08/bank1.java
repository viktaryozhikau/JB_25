package by.epa.jb25.Lesson08;

public class bank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			BankAccount ba1 = new BankAccount("Vasia", 123456789, 200, "USD");
			BankAccount ba2 = new BankAccount("Dima", 123456780, 300, "USD");
			BankAccount ba3 = new BankAccount("Masha", 123456788, 400, "USD");
			BankAccount ba4 = new BankAccount("Sara", 123456799, 600, "USD");
			
			Payment pay1 = new Payment("book", 120);
			Payment pay2 = new Payment("table", 185);
			String cur = ba1.getAccountCurrensy();

			System.out.println("Accounts: ");
			System.out.println(ba1.toString());
			System.out.println(ba2.toString());
			System.out.println(ba3.toString());
			System.out.println(ba4.toString());
			System.out.println();
					
			System.out.println("Goods list: ");
			System.out.println(pay1.toString());
			System.out.println(pay2.toString());
			System.out.println();
			
			System.out.println("Account balance: ");
			System.out.println(ba1.getClientName()+" "+(ba1.getAccountAmount() - pay1.getPrice() - pay2.getPrice())+" "+cur);
			System.out.println(ba2.getClientName()+" "+(ba2.getAccountAmount() - pay1.getPrice() - pay2.getPrice())+" "+cur);
			System.out.println(ba3.getClientName()+" "+(ba3.getAccountAmount() - pay1.getPrice() - pay2.getPrice())+" "+cur);
			System.out.println(ba4.getClientName()+" "+(ba4.getAccountAmount() - pay1.getPrice() - pay2.getPrice())+" "+cur);
			

	}

}
