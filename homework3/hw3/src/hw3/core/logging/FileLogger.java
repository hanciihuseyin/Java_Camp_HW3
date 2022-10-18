package hw3.core.logging;

public class FileLogger implements Ilogger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı." + data);
	}

}
