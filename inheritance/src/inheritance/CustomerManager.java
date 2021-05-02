package inheritance;

public class CustomerManager {
	//veritaban�na eri�ece�imiz i� kurallar�n� yazaca��z
	//ekle sil g�ncelle listele ara vs..
	
	//Customer,  onu extend eden s�n�flar�n referanslar�n� tutabiliyor
	public void add(Customer customer) {
		
	}
	
	//�oklu ekleme yapaca��z:
	//her m��teri t�r� i�in farkl� logicleri �al��t�rm�� olucam
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
