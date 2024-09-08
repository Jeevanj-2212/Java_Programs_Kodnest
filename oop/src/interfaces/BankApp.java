package interfaces;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI s = new Sbi();
		Pnb p = new Pnb();
		BankApp b = new BankApp();
		b.accessBank(s);
		b.accessBank(p);
		

	}
	public void accessBank(RBI r) {
		r.giveLoan();
		r.createAccount();
		r.provideAtmCard();
	}

}
interface RBI {
	void giveLoan();
	void createAccount();
	void provideAtmCard();
}
class Sbi implements RBI {

	@Override
	public void giveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Give loan at 7.5% interest");
		
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("create saving Account");
		
	}

	@Override
	public void provideAtmCard() {
		// TODO Auto-generated method stub
		System.out.println("provide max 2 atm cards");
	}
	
}
class Pnb implements RBI {

	@Override
	public void giveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Give loan at 9.0% interest");
		
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("create buisness Account");
		
	}

	@Override
	public void provideAtmCard() {
		// TODO Auto-generated method stub
		System.out.println("provide max 3 atm cards");
	}
	
}

