//Criado por Wilmar Santos
import javax.swing.JOptionPane;


//Criação da Aplicação Gráfica
public class ParteGrafica {
    


    public static void main(String[] args) {

      //parte aonde é feita a instancia da moeda e temperatura, assim podendo usar seus metados
        ConversorMoedas moedas = new ConversorMoedas();
        ConversorTemperatura temperaturas = new ConversorTemperatura();

        //while criado para enquanto o usuario não apertar para sair, a aplicacao vai continuar rodando
         while(true){

          //primeiraa interface grafica, aonde fica o menu, para o usuario escolher entre conversao de moedas ou conversao de temperaturas.
        String opcoes =  JOptionPane.showInputDialog(null, "Escolha uma conversao", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de moedas", "Conversor de temperatura",},"Escolha").toString();



        // caso o usuario escolha a opcao de conversor de moedas.
        switch (opcoes) {   

            case "Conversor de moedas":

            //caso o usuario escolha o conversor de moedas, aparece essa interface grafica, aonde ele tera que escolher entre as seguintes opcaoes:
            //real/dolar, real/libra
            //dolar/real, dolar/libra
            //libra/real, libra/dolar
          
            String escolhaMoedas =  JOptionPane.showInputDialog(null, "Escolha uma opcao ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Reais para Dolar", "Reais para Libras", "Dolar para reais", "Dolar para libras", "Libra para reais", "libra para dolar"},"EscolhaMoedas").toString();


            //cada opcao que o usuario escolher ira cair nesse switch e fazerá a conversao corresponde
            switch (escolhaMoedas) {
                case "Reais para Dolar":
                   String inputRealDolar = JOptionPane.showInputDialog("insira um valor em reais");
                   double valorDolar = Double.parseDouble(inputRealDolar);
                  moedas.converterReaisDolar(valorDolar);
    
                    break;
    
                   case "Reais para Libras":
                   String inputRealLibra = JOptionPane.showInputDialog("insira um valor em reais");
                   double valorLibra = Double.parseDouble(inputRealLibra);
                  moedas.converterReaisLibra(valorLibra);
    
                  break;
    
                  case "Dolar para reais":
    
                  String inputDolaReal = JOptionPane.showInputDialog("insira um valor em dolar");
                  double inputDolar = Double.parseDouble(inputDolaReal);
                 moedas.converterDolarReais(inputDolar);
    
                  break;
    
                  case "Dolar para libras":
    
                  String inputDolaLibra = JOptionPane.showInputDialog("insira um valor em dolar");
                  double inputDolarL = Double.parseDouble(inputDolaLibra);
                 moedas.converteDolarLibra(inputDolarL);
    
                  break;
    
                 case "Libra para reais":
    
                 String inputLibraReal = JOptionPane.showInputDialog("insira um valor em libras");
                  double inputLibraR = Double.parseDouble(inputLibraReal);
                 moedas.converteLibraReais(inputLibraR);;
    
    
                 break;
    
                 case "libra para dolar":
    
                 String inputLibraDolar = JOptionPane.showInputDialog("insira um valor em libras");
                  double inputLibraD = Double.parseDouble(inputLibraDolar);
                 moedas.converteLibraDolar(inputLibraD);

                 break;
            
                default:

                    break;

            }

            break;

              //caso o usuario escolha a opcao de conversor de temperaturas;
            case "Conversor de temperatura":

            //aqui é criado a interface grafica do conversor de temperaturas
            //as opocoes sao
            //celsius para kelvin
            //celsius para fahrenheit
            //kelvin para celsius
            //kelvin para fahrenheit
            //fahrenheit para celsius
            //fahrenheit para kelvin
            String escolhaTemperaturas = JOptionPane.showInputDialog(null, "Escolha uma opcao ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Celsius para Kelvin", "Celsius para Fahrenheit", "kelvin para Celsius", "Kelvin para Fahrenheit", "Fahrenheit para Celsius", "farhenheit para Kelvin"},"EscolhaTemperaturas").toString();

            //ao escolher alguma conversao de temperatura, ira cair nesse switvh que ira fazer a conversao correspondente
               switch(escolhaTemperaturas){

                  case "Celsius para Kelvin":

                  String CelsiusK = JOptionPane.showInputDialog ("insira a temperatura em Celsius");
                  double inputCelsiusK = Double.parseDouble(CelsiusK);
                   temperaturas.conversorCelsiusK(inputCelsiusK);

                  break;

                case "Celsius para Fahrenheit":

                
                String CelsiusF = JOptionPane.showInputDialog ("insira a temperatura em Celsius");
                double inputCelsiusF = Double.parseDouble(CelsiusF);
                 temperaturas.conversorCelsiusFahrenheit(inputCelsiusF);


                break;

                case "kelvin para Celsius":

                
                String kelvinC = JOptionPane.showInputDialog ("insira a temperatura em kelvin");
                double inputKelvinC = Double.parseDouble(kelvinC);
                 temperaturas.conversorKelvinCelsius(inputKelvinC);


                break ;

                case "Kelvin para Fahrenheit":

                String kelvinF = JOptionPane.showInputDialog ("insira a temperatura em kelvin");
                double inputKelvinF = Double.parseDouble(kelvinF);
                 temperaturas.conversorKelvinFahrenheit(inputKelvinF);

                break;

                case "Fahrenheit para Celsius":

                String fahrenheitC = JOptionPane.showInputDialog ("insira a temperatura em Fahrenheit");
                double inputFahreneitC = Double.parseDouble(fahrenheitC);
                 temperaturas.conversorFahrenheitCelsius(inputFahreneitC);

                 break;

                 case "farhenheit para Kelvin":

                 String fahrenheitK = JOptionPane.showInputDialog ("insira a temperatura em Fahrenheit");
                double inputFahreneitK = Double.parseDouble(fahrenheitK);
                 temperaturas.conversorFahrenheitKelvin(inputFahreneitK);

                 break;
            
           }  

          break;

          default:
          break;


            
    }
   }
  } 
}