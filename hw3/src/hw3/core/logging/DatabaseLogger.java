package hw3.core.logging;

public class DatabaseLogger implements Ilogger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına loglandı." + data);
		
	}

}
