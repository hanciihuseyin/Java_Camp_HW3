package hw3;

import java.util.ArrayList;
import java.util.List;

import hw3.business.CategoryManager;
import hw3.business.CourseManager;
import hw3.business.InstructorManager;
import hw3.core.logging.DatabaseLogger;
import hw3.core.logging.FileLogger;
import hw3.core.logging.Ilogger;
import hw3.core.logging.MailLogger;
import hw3.dataAccess.hibernate.HbCategoryDao;
import hw3.dataAccess.jdbc.JdbcCourseDao;
import hw3.dataAccess.jdbc.JdbcInstructorDao;
import hw3.entities.Category;
import hw3.entities.Course;
import hw3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Instructor instructor1 = new Instructor("Hüseyin ", "Hanci ", 25, " Java\n");
		Category category1 = new Category(5, "Programlama");
		Course course1 = new Course (10, "Yazılım Geliştirici Yetiştirme Kampı - Java", 150, "Engin Demiroğ");
		
		Ilogger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		
		InstructorManager instructorManager = new InstructorManager(loggers, new JdbcInstructorDao());
		instructorManager.add(instructor1);
		
		List<Category> categoryy = new ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(loggers, new HbCategoryDao(), categoryy );
		categoryManager.add(category1);
		
		List<Course> coursee = new ArrayList<>();
		CourseManager courseManager = new CourseManager(loggers, new JdbcCourseDao(), coursee);
		courseManager.add(course1);
		
	}

}
