package nLayeredDemo.jLogger;

public class JLoggerManager {
	public void log(String message) {
		System.out.println("J logger ile logland�" + message);
	}
	//burada bilmedi�imiz bir kod yaz�lmis, buna dokunam�yoruz
	//bunu sistemimize enjekte edicez
	//micro serivce mimarileri de bu mant�kla enjecte edilir
	
	//dependency injection yapamam interface i yok
	//olsa bile injection yine yapamam 
	//o d�� servise ba��ml� olurum yine --> servis de�i�ir ve abc ye gecilirse yand�k :|
}
