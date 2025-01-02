package interviewImpQuestions;

class Numbers extends Thread {
	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}
}

public class Threads {
	public static void main(String[] args) throws InterruptedException {
		Numbers nums = new Numbers();
		Runnable alph = () -> {
			int i = 65;
			while (i < 75) {
				char temp = (char) i;
				System.out.println(temp + "-" + i);
				i++;
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
			}
		};

		Thread alphThread = new Thread(alph);

		nums.start(); // it will search for a method named as run

		alphThread.start(); // it will search for a method named as run

		alphThread.setName("alphabets thread");
		System.out.println(alphThread.getName());
		nums.join();
		alphThread.join();

		System.out.println("I am at main thread");
	}
}
