public class IronMan {
	Person person;

	IronMan(Person person) {
		this.person = person;
	}

	String introduce() {
		return person.introduce();
	}
}
