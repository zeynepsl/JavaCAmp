package interfaces;

public class Utils {
	//kendimi tekrar etmemek i�in :
	//message ve logger de�i�ebilir
	
	//static : Class � new lememk i�in
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
