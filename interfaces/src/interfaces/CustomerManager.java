package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;//bunu tan�mlamam�z�n sebebi
	//Class �n her yerinden eri�ebilmek
	//yoksa kurucu ya g�nderdi�imi ben class �n hi�bir yerinde kullanmamam
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("m��teri eklendi " + customer.getFirstName());
		
		//this.loggers.log(customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());//objeyi serile�tirip logluyoruz
		//bellekte new
		
		//Veritaban�na loglanacak dendi(micro service mimarisi odakl�)
		//burada gelip DataBaseLogger � new lemiyorsun
		//ve geldin 2500 yerde bunu kulland�n
		//demezler mi fileLogger a ge�icez
		//tek tek tek hepsini de�i�tireceksin --> tehilikeli �ok �ok
		
	}
	
	
	//burada DatabaseLogger, FileLOgger vs yok 
	//interface e ba��ml�y�z
	//interface de di�erlerinin referas�n�t tutabiliyor
	//evet loglamaya ba��ml�y�z ama gev�ek ba��ml�y�z
	
	public void delete(Customer customer) {
		Utils.runLoggers(loggers, customer.getFirstName());//objeyi serile�tirip logluyoruz

	}

	public void update(Customer customer) {
		Utils.runLoggers(loggers, customer.getFirstName());//objeyi serile�tirip logluyoruz

	}
}
