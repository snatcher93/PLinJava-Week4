public class Person {
	String name;
	int age;

	Person() {
		this("사람", 1);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String message() {
	    return "Message : [" + introduce() + "]"; 
	}

	String introduce() {
		return "이름 : " + name + ", 나이 " + age + "세";
	}

	public static void main(String[] args) {
		Person yotsuba = new Killer("요츠바", 5, 
                "You can tell me in hell.", "총");

		System.out.println(yotsuba.introduce());
	}
}
