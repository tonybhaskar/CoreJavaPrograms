package userDefinedExceptionHandling;

import java.util.Scanner;


class InvalidAccountNumberException extends Exception{
	public String getMessage() {
		return "****Invalid Account Number****";
	}
}

class InvalidPasswordException extends Exception{
	public String getMessage() {
		return "****Invalid Password****";
	}
}

class Customer{
	private int accno;
	private int pwd;
	private int org_accno = 111;
	private int org_pwd = 123;

	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account no: ");
		accno = sc.nextInt();
		System.out.println("Enter your password: ");
		pwd = sc.nextInt();
	}
	
	void validateData() throws InvalidPasswordException, InvalidAccountNumberException {
		if(accno == org_accno) {
			if(pwd == org_pwd ) {
				System.out.println("Valid user");
			}else {
				InvalidPasswordException ipe = new InvalidPasswordException();
				System.out.println(ipe.getMessage());
				throw ipe;
			}
		}else {
			InvalidAccountNumberException iae = new InvalidAccountNumberException();
			System.out.println(iae.getMessage());
			throw iae;
		}
	}
}

class NetBanking{
	void verify(Customer c) {
		try {
			c.collectData();
			c.validateData();
		} catch (InvalidAccountNumberException | InvalidPasswordException e1) {
			try {
				c.collectData();
				c.validateData();
			} catch (InvalidAccountNumberException | InvalidPasswordException e2) {
				try {
					c.collectData();
					c.validateData();
				} catch (InvalidAccountNumberException | InvalidPasswordException e3) {
					System.out.println("User is blocked");
					System.exit(0);
				}
			}
		}
	}
}

public class CustomExceptions_D11 {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		NetBanking nb = new NetBanking();
		nb.verify(c1);
	}

}
