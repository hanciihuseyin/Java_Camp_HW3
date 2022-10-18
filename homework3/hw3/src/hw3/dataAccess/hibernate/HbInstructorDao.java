package hw3.dataAccess.hibernate;

import hw3.dataAccess.IInstructorDao;
import hw3.entities.Instructor;

public class HbInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		//Sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("Hibernate ile veri tabanına eklendi.");
	}

}
