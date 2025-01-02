package multiThreadedProgramming;

public class ThreadIntro_D12 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread t1 = new Thread();
		t1.setName("tony");
		t1.setPriority(3);
		System.out.println(t1);
		
	}
	

}
