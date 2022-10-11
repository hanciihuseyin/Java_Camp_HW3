package polymorphis;

public class Main {

	public static void main(String[] args) {
		/*
		 * EmailLogger logger = new EmailLogger(); logger.Log("Log mesajı ");
		 * 
		 * BaseLogger[] loggers=new BaseLogger[] {new FileLogger(), new
		 * DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
		 * 
		 * for (BaseLogger baseLogger : loggers) { baseLogger.Log("Log mesajı"); }
		 */
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
