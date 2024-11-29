package oops.nov29;

class Brain {
	private String size;
	private int iq;

	Brain(String size, int iq) {
		this.size = size;
		this.iq = iq;
	}

	public void getSize() {
		System.out.println(size);
	}

	public void getIq() {
		System.out.println(iq);
	}

}

class Heart {
	private int heart_rate;
	private double weigth;

	Heart(int heart_rate, double weight) {
		this.heart_rate = heart_rate;
		this.weigth = weight;
	}

	public int getHeart_rate() {
		return heart_rate;
	}

	public double getWeigth() {
		return weigth;
	}

}

class Human {
	Heart heart;
	Brain brain;

	Human(Heart heart, Brain brain) {
		this.heart = heart;
		this.brain = brain;
	}

}

class Book {
	private String name;
	private String author;

	Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

}

class Mobile {
	private String brand;
	private double price;

	Mobile(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

}

class Student extends Human {
	Book book;
	Mobile mobile;
	
	Student(Heart heart, Brain brain, Book book, Mobile mobile){
		super(heart, brain);
		this.book = book;
		this.mobile = mobile;
	}
}

public class IsHasRelations {
	
	public static void main(String[] args) {
		//for human
		Brain brain = new Brain("small", 120);
		Heart heart = new Heart(72, 40.52);
		
		//for student
		Book book = new Book("ignite minds", "abdul kalam");
		Mobile mobile = new Mobile("Redmi", 13000.89);
		
		Student student = new Student(heart, brain, book, mobile);
		
		System.out.println(student.book.getAuthor());
		System.out.println(student.book.getName());
	}
	
}

























