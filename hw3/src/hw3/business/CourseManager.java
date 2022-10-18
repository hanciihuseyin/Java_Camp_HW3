package hw3.business;

import java.util.List;

import hw3.core.logging.Ilogger;
import hw3.dataAccess.ICourseDao;
import hw3.entities.Course;

public class CourseManager {
	private Ilogger[] loggers;
	private ICourseDao courseDao;
	private List<Course> courses;

	public CourseManager(Ilogger[] loggers, ICourseDao courseDao, List<Course> courses) {
		super();
		this.loggers = loggers;
		this.courseDao = courseDao;
		this.courses=courses;
	}

	public void add(Course course) throws Exception {
		
		for (Course course1 : courses) {
			if(course1.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi tekrar edemez.");
			}
		}
		courses.add(course);
		
		if (course.getUnitPrice() < 0) {
			throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz.");
		}
		
		courseDao.add(course);
		for (Ilogger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
	
}
