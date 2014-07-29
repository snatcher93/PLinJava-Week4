public class Musician extends Person {
	String instrument;

	Musician(String name, int age, String instrument) {
		this.name = name;
		this.age = age;
		this.instrument = instrument;
	}

	String introduce() {
		return "악기 : " + instrument + ", " + super.introduce();
	}

	String play() {
		return instrument + " ����";
	}
}
