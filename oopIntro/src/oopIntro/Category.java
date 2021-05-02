package oopIntro;

public class Category {
	private int id;
	private String name;

	public Category() {
	}
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//metot �al���nca ortaya ��kan veri t�r�, d�nd�rece�i t�r: int
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;//class daki �d yi gelen id yap
	}
	
	public String getName() {
		return this.name + "!";
	}
	
	public void setName(String name) {
	     this.name=name;
	}
}
