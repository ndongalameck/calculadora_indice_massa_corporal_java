import javax.swing.JOptionPane;
/**
*	descricao: calculadora de peso(ainda informa se está no peso ideal)
*	IMC = pesoEmQuilograma / (alturaEmMetros * AlturaEmMetros)
*	@author: Hus Meck
*/

	public class IMC
	{
		public static void main(String[] args)
		{
			String peso = JOptionPane.showInputDialog("Informa o seu peso em Quilograma");
			String altura = JOptionPane.showInputDialog("Informa a sua altura");
			
			double pesoEmQuilograma = Double.parseDouble(peso);
			double alturaEmMetros = Double.parseDouble(altura);
			double imc = pesoEmQuilograma / (alturaEmMetros * alturaEmMetros);
			
			// operador ternario : avaliacao ? "valor1" : "valor2";
			String msg = (imc >= 20 && imc <= 25) ? "Seu peso é ideal" : "Está fora do peso";
			msg = "IMC = "+ imc + "\n" + msg;
			
			JOptionPane.showMessageDialog(null, msg);
		}
	}
