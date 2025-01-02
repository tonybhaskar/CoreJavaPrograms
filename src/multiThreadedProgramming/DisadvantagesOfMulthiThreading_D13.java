package multiThreadedProgramming;

class Human extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" has left the bathroom");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class DisadvantagesOfMulthiThreading_D13 {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		Human h3 = new Human();
		
		h1.setName("boy");
		h2.setName("girl");
		h3.setName("others");
		
		h1.start();
		h2.start();
		h3.start();
		
	}

}
