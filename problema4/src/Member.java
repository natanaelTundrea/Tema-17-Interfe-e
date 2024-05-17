
public class Member {
	
	String name;
	int age;
	
	//constructor
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String toString() {
		return getName() + " (" + getAge() + " ani)";
	}

}
