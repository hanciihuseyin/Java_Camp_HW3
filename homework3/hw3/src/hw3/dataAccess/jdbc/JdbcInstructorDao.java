package hw3.dataAccess.jdbc;

import hw3.dataAccess.IInstructorDao;
import hw3.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		//Sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veri tabanına eklendi.");
		
	}
	
}
