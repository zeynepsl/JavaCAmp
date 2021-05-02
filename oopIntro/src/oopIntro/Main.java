package oopIntro;

public class Main {	
	public static void main(String[] args) {
		//Product turunde, 
		//Product(int id, String name, double unitPrice, String detail) kurucu metodunu kullanarak,
		//product adinda bir nesne olusturduk:
		//Product product1= new Product(1, "lenovo", 1500, "bilg");//veritabanindan metotla gelecek bu bilgiler	
		
		Product product2= new Product();
		product2.setName("lenovo");
		product2.setDiscount(10);
		product2.setUnitPrice(15000);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product product3= new Product();
		
			
		//product3.name="Hp";//hayatta b�yle de�il mesela kural getirmen gerekti gidip kulland���n kulland���n 100 sayfada de�i�iklik yapmal�s�n
		
		Product[] products = { product2, product3};
		
		//products � gez, her birine product1 adi ver(product1, Product veri t�r�nde)
		//d�ng� d�nd�k�e eleman de�i�iyor
	    for (Product product : products) {
	    	System.out.println(product.getName());
		}
	    
		System.out.println(products.length);
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("bahce");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("ev");
		
		System.out.println(category1.getName());
		
		ProductManager productManager=new ProductManager();
		//productManager.addToCart(product);//product �n bellek adresini g�nderiyoruz
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		//1 kere yaz her yerden �a��r
	}
}