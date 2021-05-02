package inheritance2;

//email ile ilgili loglama lar burada
public class EmailLogger extends Logger {
	//ben base deki log metodunu be�enmedim �st�ne bir �eyler yaz�cam
	//kendi loglama kodumu yazabilmem i�in Anne ve Babamdan ald���m(base dekini) log metodunu eziyorum(override ediyorum)
	
	@Override
	public void log() {
		System.out.println("email loglama");
	}
}
