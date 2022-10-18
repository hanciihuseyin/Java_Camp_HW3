package hw3.dataAccess.hibernate;

import hw3.dataAccess.ICategoryDao;
import hw3.entities.Category;

public class HbCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		//Sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("Hibernate ile veri tabanına eklendi.");
	}

}
