package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
		//kendi interface'imi bilirim
		//ba�kas�n�n servisinin interface'ini kullanarak ona ba��ml� olmam
		//microservis mimarisi
		
	}
	//hi�bir �ekilde hibernate e ba�l� de�ilim
	//ama hibernate in referans�n� tutabilen ProductDao ya gev�ek ba��ml�y�m
	//hibernate, abc vs serviceleri gelecekte de enjekte edebilirm

	@Override
	public void add(Product product) {
		//i� kodlar�
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride �r�n kabul edilmiyor");
			return;
			//veri eri�ime gitmesini istemiyorum
			//bo� return: metodu bitir
		}
		productDao.add(product);
		loggerService.logToSystem("urun eklendi : " + product.getName());
		//HibernateProductDao dao = new HibernateProductDao();
		//dao.add(product);
		//b�yle olursa alternatif servis ekleyemeem
		//Manager'� dataAccess e b�yle s�k� s�k� ba�larsan unitTest de yazamazs�n
		//unitTest : kodu kod ile test etme
		//         : i� katman�n� kontrol ediyorsan veritaban�na gidemezsin
		//ama bu gidiyor
		//db ler s�rekli degiskenlik g�sterece�i i�in test senaryolar�m�z �al��maz
		//unitTest yazrken sahte yapilar ile �al���r�z
		
		//dependency injection yap�caz 
		//sen dataAcces e ba��ml�s�n ama gev�ek ba��ml�s�n
		//dataAccess in sadece, referans tutucu olan abstaract klas�r�ndeki yap�s�na ba�lanabilrisn
		//manager Hibernate ten asla haberdar de�il
		//manager, sadece kullanaca�� dataAccess interface inden haberdar
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
