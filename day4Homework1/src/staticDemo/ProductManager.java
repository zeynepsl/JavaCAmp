package staticDemo;

//�r�n ekleyecek ortam
public class ProductManager {
	//product � veri eri�m katman�na (db ye ) g�nder
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		if(validator.isValid(product)) {
			System.out.println("eklendi");
		}
		else {
			System.out.println("ge�ersiz bilgi");
		}
		
	}
}
