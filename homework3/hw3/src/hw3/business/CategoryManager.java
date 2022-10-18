package hw3.business;

import java.util.List;

import hw3.core.logging.Ilogger;
import hw3.dataAccess.ICategoryDao;
import hw3.entities.Category;

public class CategoryManager {
	
	private ICategoryDao categoryDao;
	private Ilogger[] loggers;
	private List<Category> categories;

	public CategoryManager(Ilogger[] loggers , ICategoryDao categoryDao, List<Category> categories) {
		super();
		this.loggers = loggers;
		this.categoryDao= categoryDao;
		this.categories=categories;
	}
	public void add(Category category) throws Exception {
		
		for (Category category1 : categories) {
			if(category1.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori ismi tekrar edemez.");
			}
		}
		categories.add(category);
		categoryDao.add(category);
		
		for (Ilogger logger : loggers) {
			logger.log(category.getId() + category.getCategoryName());
		}
	}
}
