
public class Alimentacao {
	public static void main(String[] args) {
		
		
		Mamifero mamifero1 = new Elefante();
		System.out.println("Um elefante consome " + mamifero1.obterCotaDiariaLeite());
		Mamifero mamifero2 = new Rato();
		System.out.println("Um rato consome " + mamifero2.obterCotaDiariaLeite());
		
	}
}
