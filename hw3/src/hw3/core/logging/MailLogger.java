package hw3.core.logging;

public class MailLogger implements Ilogger{

	@Override
	public void log(String data) {
		System.out.println("Mail gönderildi" + data);
		
	}

}
