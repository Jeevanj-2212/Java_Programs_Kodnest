package polymorphism;

public class RobotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r;
		r= new FighterRobot();
		accessRobot(r);
		r =new DriverRobot();
		accessRobot(r);
		r = new TeacherRobot();
		accessRobot(r);
		r = new PlayerRobot();
		accessRobot(r);
	}
		/*r.learn();
		r.talk();
		r.charge();
		
		r.learn();
		r.talk();
		r.charge();*/
		public static void accessRobot(Robot r) {
		r.learn();
		r.talk();
		r.charge();

	}

}
class Robot {
	void learn() {
		System.out.println("Robot is learning");
	}
	void talk() {
		System.out.println("Robot is talking");
	}
	void charge() {
		System.out.println("Robot is charging");
	}
}
class FighterRobot extends Robot {
	void learn() {
		System.out.println("Fighter Robot is learning");
	}
	void talk() {
		System.out.println("Fighter Robot is talking");
	}
	void charge() {
		System.out.println("Fighter Robot is charging");
	}
}
class DriverRobot extends Robot {
	void learn() {
		System.out.println("Driver  Robot is learning");
	}
	void talk() {
		System.out.println("Driver  Robot is talking");
	}
	void charge() {
		System.out.println("Driver Robot is charging");
	}
}
class TeacherRobot extends Robot {
	void learn() {
		System.out.println("Teacher  Robot is learning");
	}
	void talk() {
		System.out.println("Teacher  Robot is talking");
	}
	void charge() {
		System.out.println("Teacher  Robot is charging");
	}
}
class PlayerRobot extends Robot {
	void learn() {
		System.out.println("Player  Robot is learning");
	}
	void talk() {
		System.out.println("Player  Robot is talking");
	}
	void charge() {
		System.out.println("Player Robot is charging");
	}
}
