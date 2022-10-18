package hw3.dataAccess.jdbc;

import hw3.dataAccess.ICategoryDao;
import hw3.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		//Sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veri tabanına eklendi.");
	}

}
