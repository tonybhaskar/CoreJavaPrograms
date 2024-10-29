package allAboutStatic.oct28;

import java.util.Scanner;

class Person{
	static String nationality;
	double uid;
	String name;
	String address;
	String gender;
	
	static {
		nationality = "Indian";
	}
	
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		
		System.out.println("Enter your uid: ");
		uid = sc.nextDouble();
//		sc.nextLine();
		System.out.println("Enter your address: ");
		address = sc.nextLine();
		
		System.out.println("Enter your gender: ");
		gender = sc.next();
		
		
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("UID: "+uid);
		System.out.println("Address: "+address);
		System.out.println("Nationality: "+nationality);
		System.out.println("Gender: "+gender);
	}
}

public class CollectAadhaarDetails {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.collectData();
		person1.display();
		System.out.println("-------------");
		
		person2.collectData();
		person2.display();
		System.out.println("-------------");
		
	}

}
