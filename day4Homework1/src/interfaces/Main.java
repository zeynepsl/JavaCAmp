package interfaces;

public class Main {

	public static void main(String[] args) {
		//polymorphism in interface lerle uygulanma versiyonu : 
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());//OracleCustomerDal �n referans� e�itlenecek
		//customerManager.customerDal = new OracleCustomerDal();//ama programc� bunu vermeyi unutabilir --> kurucuya yaz�cazz :D
		customerManager.add();
	}

}
