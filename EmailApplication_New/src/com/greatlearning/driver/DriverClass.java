package com.greatlearning.driver;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;
import java.util.*;
public class DriverClass {
	private static final CredentialsService credentialsService = new CredentialsService();
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter first name and last name");
		String firstname = sc.nextLine();
		String lastname = sc.nextLine();
		Employee employee = new Employee(firstname, lastname);
		String generatedEmail;
		String generatedPassword;
		System.out.println("Enter Department");
		System.out.println("1) Technical");
		System.out.println("1) HR");
		System.out.println("1) Admin");
		System.out.println("1) Accounts");
		
		int a =sc.nextInt();
		
		switch(a)
		{
		case 1:
		{
			generatedPassword = credentialsService.generatePassword();
			generatedEmail =  credentialsService.getEmailAddress(firstname, lastname, "Technical");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
			
		}
		break;
		case 2:
		{
			generatedPassword = credentialsService.generatePassword();
			generatedEmail =  credentialsService.getEmailAddress(firstname, lastname, "Hr");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		case 3:
		{
			generatedPassword = credentialsService.generatePassword();
			generatedEmail =  credentialsService.getEmailAddress(firstname, lastname, "Admin");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		case 4:
		{
			generatedPassword = credentialsService.generatePassword();
			generatedEmail =  credentialsService.getEmailAddress(firstname, lastname, "Accounts");
			credentialsService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		}
	}
}
