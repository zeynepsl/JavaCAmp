package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("veritaban�na");
		}
		else if(logType==2) {
			System.out.println("dosyaya");
		}
		else {
			System.out.println("email g�nderildi");
		}
		
		//bu: enum
		//ger�ek hayattta loglama sat�rlarca
		//sonra kodlar ifler i� i�e ge�mi� oluyor i�in i�inden ��k�lm�yor : spaggeti :F
		//hata verdirmeye y�nelik durumlar
	}
}
