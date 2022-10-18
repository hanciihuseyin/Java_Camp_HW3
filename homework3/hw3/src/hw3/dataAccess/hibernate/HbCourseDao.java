package hw3.dataAccess.hibernate;

import hw3.dataAccess.ICourseDao;
import hw3.entities.Course;

public class HbCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		//Sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("Hibernate ile veri tabanına eklendi.");
	}
	
}
