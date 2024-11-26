package deadlock;

public class Warrior implements Runnable {
	String astra1 = "Sarpastra";
	String astra2 = "Bramhastra";
	String astra3 = "Pashupatastra";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if(name.equals("Arjuna")) {
			arjunaAcquireAstra();
		}
		else {
			karnaAcquireAstra();
		}
		
	}
	public void arjunaAcquireAstra() {
		try {
			Thread.sleep(5000);
			synchronized (astra1) {
				System.out.println(Thread.currentThread().getName()+" has acquired resource 1 "+astra1);
				Thread.sleep(5000);
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName()+" has acquired resource 2 "+astra2);
					Thread.sleep(5000);
					synchronized (astra3) {
						System.out.println(Thread.currentThread().getName()+" has acquired resource 3 "+astra3);
						Thread.sleep(5000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void karnaAcquireAstra() {
		try {
			Thread.sleep(5000);
			synchronized (astra1) {
				System.out.println(Thread.currentThread().getName()+" has acquired resource 1 "+astra1);
				Thread.sleep(5000);
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName()+" has acquired resource 2 "+astra2);
					Thread.sleep(5000);
					synchronized (astra3) {
						System.out.println(Thread.currentThread().getName()+" has acquired resource 3 "+astra3);
						Thread.sleep(5000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
