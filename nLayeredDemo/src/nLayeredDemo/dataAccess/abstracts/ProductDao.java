package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao 
//product i�in veri eri�im interface i
//repository ismide kullan�l�r
{
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);	//verilen id ye g�re Product getirir
	List<Product> getAll();	//T�m �r�nleri getir

	
}
