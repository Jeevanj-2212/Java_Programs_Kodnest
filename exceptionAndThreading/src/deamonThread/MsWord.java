package deamonThread;

public class MsWord implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if(name.equals("type")) {
			type();
		}
		else if(name.equals("spell")) {
			spellCheck();
		}
		else {
			autoSave();
		}
		
	}
	public void type() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Typing....");
				Thread.sleep(5000);
			}
		}
		catch (Exception e) {
		   e.printStackTrace();
		}
			
		
	}
	public void spellCheck() {
		try {
			for(;;) {
				System.out.println("Spell check..");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void autoSave() {
		try {
			for(;;) {
				System.out.println("Autosaving...");
				Thread.sleep(5000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
