public class Killer extends Person {
	String warning;
	String weapon;

	Killer(String name, int age, String warning, String weapon) {
		super(name, age);
		this.warning = warning;
		this.weapon = weapon;
	}

	String introduce() {
		return "¹«±â : " + weapon + ", " + super.introduce();
	}

	String getWeapon() {
		return weapon;
	}
}
