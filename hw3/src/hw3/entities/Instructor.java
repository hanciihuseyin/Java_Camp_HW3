package hw3.entities;

public class Instructor {
	private String name;
	private String lastName;
	private int age;
	private String courseName;
	public Instructor() {
		super();
	}		
	public Instructor(String name, String lastName, int age, String courseName) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.courseName = courseName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
}
