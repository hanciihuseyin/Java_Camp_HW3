package hw3.dataAccess.jdbc;

import hw3.dataAccess.ICourseDao;
import hw3.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		//Sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veri tabanına eklendi.");
		
	}

}
