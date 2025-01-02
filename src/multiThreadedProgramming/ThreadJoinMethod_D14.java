package multiThreadedProgramming;

class Human_1 extends Thread{
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

public class ThreadJoinMethod_D14 {

	public static void main(String[] args) throws InterruptedException {
		Human_1 h1 = new Human_1();
		Human_1 h2 = new Human_1();
		Human_1 h3 = new Human_1();
		
		h1.setName("boy");
		h2.setName("girl");
		h3.setName("others");
		
		h1.start();
		h1.join();
		h2.start();
		h2.join();
		h3.start();
		h3.join();
		
	}

}
