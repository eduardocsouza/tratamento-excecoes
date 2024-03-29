package program;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class ExerciseProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("NUmber: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw:");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println(account);
		}
		catch(AccountException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
