package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		//sistem companyName girmeye izin veriyor
		//i�te sistemin izin verdi�i noktada patl�yorum
		
		IndividualCustomer zeynep = new IndividualCustomer();
		zeynep.customerNumber="123";
		
		CorporateCustomer trendYol = new CorporateCustomer();
		trendYol.customerNumber="456";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		
		CustomerManager customerManager = new CustomerManager();
		
		//tekli ekleme :
		//polymorphism :
		customerManager.add(zeynep);//asl�nda zeynebin bellekteki adresini g�nderdim
		customerManager.add(trendYol);
		customerManager.add(sendikaCustomer);
		
		//�oklu ekleme :
		Customer[] customers = {zeynep, trendYol, sendikaCustomer};
		customerManager.addMultiple(customers);
	}

}
