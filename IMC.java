import javax.swing.JOptionPane;
/*
*	descricao: calculadora de peso(ainda informa se está no peso ideal)
*	IMC = pesoEmQuilograma / (alturaEmMetros * AlturaEmMetros)
*	@author: Hus Meck
*/

	public class IMC
	{
		public static void main(String[] yosica)
		{
			String peso = JOptionPane.showInputDialog("Informa o seu peso em Quilograma");
			String altura = JOptionPane.showInputDialog("Informa a sua altura");
			String msg;
			
			double pesoEmQuilograma = Double.parseDouble(peso);
			double alturaEmMetros = Double.parseDouble(altura);
			double imc = pesoEmQuilograma / (alturaEmMetros * alturaEmMetros);
			
			// operador ternario : avaliacao ? "valor1" : "valor2";
			if(imc >= 10 && imc <= 20){
				msg="Estás preste a morrer";}
			else if(imc >= 20 && imc <= 25){
				msg="Seu peso é ideal";}
			else{
				msg="Estás fora do peso ou gordo";}
			msg = "IMC = "+ imc + "\n" + msg;
			
			JOptionPane.showMessageDialog(null, msg);
	// Antonio Yosica
			
			// teste
			System.out.println("ola mundo !!!");
			
			// mais um teste
			System.out.println("ola mundo !!!");

		}
	}
