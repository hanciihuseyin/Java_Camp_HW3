package hw3.business;

import hw3.core.logging.Ilogger;
import hw3.dataAccess.IInstructorDao;
import hw3.entities.Instructor;

public class InstructorManager {
	private IInstructorDao instructorDao;
	private Ilogger[] loggers;

	public InstructorManager(Ilogger[] loggers, IInstructorDao instructorDao) {
		super();
		this.loggers = loggers;
		this.instructorDao=instructorDao;
	}
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Ilogger logger : loggers) {
			logger.log(instructor.getName() + instructor.getLastName() + instructor.getAge() + instructor.getCourseName() );
		}
	}


}
