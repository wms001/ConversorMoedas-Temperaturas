//Criado por Wilmar Santos
import javax.swing.JOptionPane;

public class ConversorMoedas {

	   //VALORES USADOS EM RELACAO AO DIA 26/08/2022!!!!!
	   
	        // metado para converter reais para dolar
	     public void converterReaisDolar(double valor){

	        double moedaReaisDolar = valor * 5.11;

	        moedaReaisDolar = (double) Math.round(moedaReaisDolar * 100d) / 100;
	        
	        JOptionPane.showMessageDialog(null, 
	        "Voce tem $ " + moedaReaisDolar + " dolares");
	     }



	   //metado para converter reais para libra     
	     public void converterReaisLibra(double valor){

	      double moedaReaisLibra = valor * 0.17;

	      moedaReaisLibra = (double) Math.round(moedaReaisLibra * 100d) / 100;
	      
	      JOptionPane.showMessageDialog(null, 
	      "Voce tem £ " + moedaReaisLibra + " libras esterlinas");
	   }


	   //metado para converter dolar para reais
	   public void converterDolarReais(double valor){

	         double dolarReais = valor / 0.20;

	         dolarReais = (double) Math.round(dolarReais * 100d) / 100;

	         JOptionPane.showMessageDialog(null, 
	      "Voce tem $ " + dolarReais + " reais");

	   }

	   //metado para converter dolar para libras
	   public void converteDolarLibra(double valor){

	         double dolarLibra = valor * 0.85;

	         
	         dolarLibra = (double) Math.round(dolarLibra * 100d) / 100;

	         JOptionPane.showMessageDialog(null, 
	         "Voce tem £ " + dolarLibra + " libras esterlinas");
	   }


	   //metado para converter libra para reais
	   public void converteLibraReais(double valor){


	      double libraReal = valor * 5.94;

	      libraReal = (double) Math.round(libraReal * 100d) / 100;

	      JOptionPane.showMessageDialog(null, 
	      "Voce tem $ " + libraReal + " reais");

	   }

	   //metado para converter libras para dolar
	   public void converteLibraDolar(double valor){

	      double libraDolar = valor * 1.17;

	      libraDolar = (double) Math.round(libraDolar * 100d) / 100;

	      JOptionPane.showMessageDialog(null, 
	      "Voce tem $ " + libraDolar + " dolares");
	   }

}

