package project;
import java.util.Scanner;
import java.util.Random;

public class Main1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int id = 0;
		double balance;
		String costumerFirstName;
		String costumerMiddleName;
		String costumerLastName;
		int birthDay;
		int birthMonth;
		int birthYear;
		String costumerPhoneNumber;
		String costumerCompanyName;
		String costumerAdress;

        System.out.println("Enter customer's first name: ");
        costumerFirstName = scan.nextLine();

        System.out.println("Enter customer's middle name: ");
        costumerMiddleName = scan.nextLine();

        System.out.println("Enter customer's last name: ");
        costumerLastName = scan.nextLine();

        System.out.println("Enter customer's date of birth (day month year): ");
        birthDay = scan.nextInt();
        birthMonth = scan.nextInt();
        birthYear = scan.nextInt();
        scan.nextLine(); 

        System.out.println("Enter customer's phone number: ");
        costumerPhoneNumber = scan.nextLine();

        System.out.println("Enter customer's company name: ");
        costumerCompanyName = scan.nextLine();

        System.out.println("Enter customer's address: ");
        costumerAdress = scan.nextLine();
		
		Date costumerDateOfBirth = new Date(birthDay, birthMonth, birthYear);
		Name costumerName=new Name(costumerFirstName, costumerMiddleName , costumerLastName);
		CustomerID costumerId = new CustomerID(costumerName, costumerDateOfBirth, costumerPhoneNumber, costumerCompanyName, costumerAdress);
        
		System.out.println("Enter balance: ");
        balance = scan.nextDouble();
        scan.nextLine(); 
		Account acc1 = new Account(id, balance, costumerId);
		Deposit deposit1 = new Deposit(acc1,100,costumerDateOfBirth);
		deposit1.Action();
		
	}

}
