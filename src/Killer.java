public class Killer extends Person {
	String warning;
	String weapon;

	Killer(String name, int age, String warning, String weapon) {
		super(name, age);
		this.warning = warning;
		this.weapon = weapon;
	}

	String introduce() {
		return "무기 : " + weapon + ", " + "이름 : " + name + ", 나이 " + age + "세";
	}

	String getWeapon() {
		return weapon;
	}
}
