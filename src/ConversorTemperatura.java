//Criado por Wilmar Santos
//biblioteca usada para criar a interface grafica
import javax.swing.JOptionPane;


// Classe para converter as temperaturas(celsius, kelvin e fahrenheit)
public class ConversorTemperatura {
    
    // celsius para kelvin
    public void conversorCelsiusK(Double valor){

        double  celsiusK = valor + 273.15;

        //parte grafica
        JOptionPane.showMessageDialog(null, 
        "A temperatura é de: " + celsiusK + " Kelvin");

    }

    //celsius para fahrenheit
    public void conversorCelsiusFahrenheit(double valor){

        double celsiusFahrenheit = (valor * 1.8) + 32;

        celsiusFahrenheit = (double) Math.round(celsiusFahrenheit * 100d) / 100;

         //parte grafica
        JOptionPane.showMessageDialog(null, 
        "A temperatura é de: " + celsiusFahrenheit + " Fahrenheit");



    }


    //kelvin para celsius
    public void conversorKelvinCelsius(double valor){
        
        double kelvinCelsius = valor - 273.15;

        kelvinCelsius = (double) Math.round(kelvinCelsius * 100d) / 100;

         //parte grafica
        JOptionPane.showMessageDialog(null, 
        "A temperatura é de: " + kelvinCelsius + "° celsius");

    
    }


    //kevin para fahrenheit
    public void conversorKelvinFahrenheit(double valor){

            double kelvinF = (valor - 273.15) * 1.8 + 32;

            kelvinF = (double) Math.round(kelvinF * 100d) / 100;

             //parte grafica
            JOptionPane.showMessageDialog(null, 
            "A temperatura é de: " + kelvinF + "° fahrenheit");

    }

    //fahrenheit para celsius

    public void conversorFahrenheitCelsius(double valor){

        double fahrenheitCelsius = (valor - 32) / 1.8;

        fahrenheitCelsius = (double) Math.round(fahrenheitCelsius * 100d) / 100;

         //parte grafica
        JOptionPane.showMessageDialog(null, 
            "A temperatura é de: " + fahrenheitCelsius + "° celsius");

    }


    //fahrenheit para kelvin
    public void conversorFahrenheitKelvin(double valor){

        double fahrenheitKelvin = (valor + 459.67) /  1.8;

        fahrenheitKelvin = (double) Math.round(fahrenheitKelvin * 100d) / 100;

         //parte grafica
        JOptionPane.showMessageDialog(null, 
            "A temperatura é de: " + fahrenheitKelvin + " kelvin");

    }

}