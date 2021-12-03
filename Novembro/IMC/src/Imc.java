import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		float altura, peso, imc;
		
		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua altura"));
		peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu peso"));
		imc = peso / (altura*altura);
		imc = Math.round(imc *100.0f)/100.0f;
		System.out.println(imc);
		
		if (imc < 18.5) {
			System.out.println("Magreza");
		} else if (imc < 24.9) {
			System.out.println("Normal");
		} else if (imc < 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc < 39.9) {
			System.out.println("Obesidade");
		} else {
			System.out.println("Obesidade Grave");
		}
	}

}
