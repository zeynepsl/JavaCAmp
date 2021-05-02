package day3Homework2;

public class BaseUserManager {
	public BaseUserManager() {
	}
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� g�ncellendi.");
	}
	
	public void listAll(User[] users) {
		for (User user : users) {
			System.out.println("kullan�c� ad�: " + user.getFirstName() + ", soyad�: " + user.getLastName());
		}
	}
}
