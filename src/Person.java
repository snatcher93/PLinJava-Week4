public class Person {
	String name;
	int age;

	Person() {
		this("���", 1);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String message() {
	    return "Message : [" + introduce() + "]"; 
	}

	String introduce() {
		return "�̸� : " + name + ", ���� " + age + "��";
	}

	public static void main(String[] args) {
		Person yotsuba = new Killer("������", 5, 
                "You can tell me in hell.", "��");

		System.out.println(yotsuba.introduce());
	}
}
