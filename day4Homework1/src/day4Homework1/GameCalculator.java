package day4Homework1;

//herkes i�in hesaplama olacak : base class
public abstract class GameCalculator {
	public abstract void hesapla();
	//kim bu class � inherit ediyorsa hesaplay� override etmek zorunda
	
	
	//gameOver oldu�u gibi kullan�lacak kimse override edemez
	public final void gameOver() {
		
	}
}
