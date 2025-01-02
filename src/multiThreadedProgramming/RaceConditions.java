package multiThreadedProgramming;

class MSOffice extends Thread {

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("type")) {
			typing();
		} else if (Thread.currentThread().getName().equals("spellcheck")) {
			spellCheck();
		} else {
			saving();
		}
	}

	// primary
	public void saving() {
		for (;;) {
			System.out.println("saving....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	//secondary
	public void spellCheck() {
		for (;;) {
			System.out.println("spell checking....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	//secondary
	public void typing() {
		for (int i = 0; i < 5; i++) {
			System.out.println("typing....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class RaceConditions {

	public static void main(String[] args) {
		MSOffice t = new MSOffice();
		MSOffice sc = new MSOffice();
		MSOffice s = new MSOffice();
		
		t.setName("type");
		sc.setName("spellcheck");
		s.setName("save");
		
		sc.setPriority(8);
		s.setPriority(9);
		
		
		sc.setDaemon(true);
		s.setDaemon(true);
		
		t.start();
		sc.start();
		s.start();
	}

}
