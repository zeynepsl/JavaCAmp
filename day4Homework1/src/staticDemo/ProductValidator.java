package staticDemo;

public class ProductValidator {
	
	/*static() {
    	System.out.println("statik yap�c�");
	}
    
    static() {
    	System.out.println("statik yap�c�");
	} 
	 * */
    
	
	public static boolean isValid(Product product) {
		if(!product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Bu metot static de�il bunu kullanab�lmem �iin class � new lemem gerekiyor
	public void biSeyYap() {
		
	}
	
	//inner class:
	public static class Baska{
		public static void sil() {}
	}
	//gruplama i�in kullan�l�r
	
}
