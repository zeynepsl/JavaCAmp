package staticDemo;

public class DatabaseHelper {
	public static class Crud {
		public static void delete() {

		}

		public static void update() {

		}
	}
	
	public static class Connection {
		public static void createConnection() {

		}
	}
}

//Bunlar �nerilmiyor(best Practice �nermiyor)
//Solid in S harfine, clean code a ters
//Tek sorumlulk prensibi _->bir class sadece 1 i� yapar
//Crud i�in ayr� , Connection i�in ayr� DatbaseHelper class olu�tur
