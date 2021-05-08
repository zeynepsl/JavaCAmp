package interfaces;

public class CustomerManager {
	
	//OracleCustomerDal customerDal = new OracleCustomerDal();
	//b�yle yazrasak OracleCustomerDal a ba��ml�y�z :|
	
	private CustomerDal customerDal; 
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//i� kodlar�
		customerDal.add();
	}
}
