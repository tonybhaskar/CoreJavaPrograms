package multiThreadedProgramming;

class Warrior extends Thread{
	
	String res1 = "AK-47";
	String res2 = "MG-42";
	String res3 = "pistol";
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("rama")) {
			ramaAcq();
		}else {
			ravanaAcq();
		}
	}

	public void ravanaAcq() {
		try {
			synchronized (res3) {
				System.out.println("Ravana acquired "+res3);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("Ravana acquired "+res2);
					Thread.sleep(3000);
					synchronized (res1) {
						System.out.println("Ravana acquired "+res1);
						Thread.sleep(3000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ramaAcq() {
		try {
			synchronized (res1) {
				System.out.println("Rama acquired "+res1);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("Rama acquired "+res2);
					Thread.sleep(3000);
					synchronized (res3) {
						System.out.println("Rama acquired "+res3);
						Thread.sleep(3000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		Warrior rama = new Warrior();
		Warrior ravana = new Warrior();
		
		rama.setName("rama");
		ravana.setName("ravana");
		
		rama.start();
		ravana.start();
	}

}
