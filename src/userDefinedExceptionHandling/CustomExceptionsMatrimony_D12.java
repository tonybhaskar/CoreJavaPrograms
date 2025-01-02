package userDefinedExceptionHandling;

import java.util.Scanner;

class OverAgeException extends Exception{
	public String getMessage() {
		return "You are already a senior citizen. Don't have over desires";
	}
}

class UnderAgeException extends Exception{
	public String getMessage() {
		return "You are yet to grow up. First be an adult to apply and think about marriage";
	}
}

class Candidate{
	int age;
	
	Scanner sc = new Scanner(System.in);
	void collectData() {
		System.out.print("Enter your age: ");
		age = sc.nextInt();
	}
	
	void verify() throws UnderAgeException, OverAgeException {
		if(age < 18) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}else if(age > 50) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}else {
			System.out.println("Welcome to matrimony");
		}
	}
}

class Matrimony{
	void permit(Candidate c) {
		try {
			c.collectData();
			c.verify();
		} catch (OverAgeException | UnderAgeException e1) {
			try {
				c.collectData();
				c.verify();
			} catch (OverAgeException | UnderAgeException e2) {
				try {
					c.collectData();
					c.verify();
				} catch (OverAgeException | UnderAgeException e3) {
					System.out.println("User is blocked");
					System.exit(0);
				}
			}
		}
	}
}

public class CustomExceptionsMatrimony_D12 {

	public static void main(String[] args) {
		Candidate c1 = new Candidate();
		Matrimony m = new Matrimony();
		m.permit(c1);
	}

}
