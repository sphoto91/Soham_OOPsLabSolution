package com.greatlearning.service;
import java.util.*;
import com.greatlearning.model.Employee;

public class CredentialsService implements ICredentialsService{

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalLetter = "ABCDEFGHI";
		String smallCaseLetter = "abcdefghijklmn";
		String numbers = "0123456789";
		String specialCharacters = "!@$%&*_";
		String value = capitalLetter + smallCaseLetter + numbers + specialCharacters;
		StringBuffer strbuffer = new StringBuffer("");
		Random random = new Random();
		int randomCharacter = 0;
		for (int i = 0; i<10; i++) {
			randomCharacter = random.nextInt(value.length());
			strbuffer.append(value.charAt(randomCharacter));
		}
		randomCharacter = random.nextInt(specialCharacters.length());
		strbuffer.append(specialCharacters.charAt(randomCharacter));
		return strbuffer.toString();
	}

	@Override
	public String getEmailAddress(String firstname, String lastname, String department) {
		// TODO Auto-generated method stub
		return firstname + lastname + "@" + department + "gl.com";
	}

	@Override
	public void showCredentials(Employee employee, String email, String generatePassword) {
		// TODO Auto-generated method stub
		System.out.println("Dear" + employee.getfirstname()+"your credentials");
		System.out.println("Email - " + email);
		System.out.println("Password - " + generatePassword);
	}
	

}
