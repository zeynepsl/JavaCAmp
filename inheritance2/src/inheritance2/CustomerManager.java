package inheritance2;

public class CustomerManager {
	//enjekte -parametre alama
	//bu LOgger refereans tutucu
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		
		//ne yollarsak onun logu �al���r
		logger.log();
		
		//DatabaseLogger databaseLogger = new DatabaseLogger();
		//databaseLogger.log();
		//bu �ekide DataBaseLogger a ba��ml� oldum, yar�n bir g�n ba�ka loglama sistemine ge�ersem ne olacak? :|
		//Bunu 100 farkl� yerde yapt�n diyelim ki
		//sonra y�netim dedi ki == dosyaya da loglama yap�lacak
	}
}
