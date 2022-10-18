package hw3.entities;

public class Course {
	private int id;
	private String courseName;
	private int unitPrice;
	private String instructorName;
	public Course() {
		super();
	}
	public Course(int id, String courseName, int unitPrice, String instructorName) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.unitPrice = unitPrice;
		this.instructorName = instructorName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
}
