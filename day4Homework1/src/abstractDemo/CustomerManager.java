package abstractDemo;



public class CustomerManager {
	BaseDatabaseManager baseDatabaseManager;//startehi g�revi
	//hangi veritaban� s�semini veririsen onun getData s� �al��caak
	//BaseDatabaseManager, di�er sstemlerin refrans�n� tutablyor

	
	public void getCustomer() {
		baseDatabaseManager.getData();
	}
}
