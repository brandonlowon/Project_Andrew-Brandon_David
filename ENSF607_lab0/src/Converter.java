public class Converter {

/* This is the development branch
 * 
* @Author: Brandon Low-On (first)
* @Author: Andrew Lee (second)
* @Author: David Laditan (third)
*/

private double celsiusToFahrenheit(double C){
	double fahrenheit = (C * 9.0/5.0) + 32;
	return fahrenheit;
}

private double fahrenheitToCelsius(double F){
	double celsius = (F-32)/1.8;
	return celsius; 
}

private double kilometersToMiles(double K) {
	double Miles = 0.621371 * K;
	return Miles;
}

public static void main(String[] args) {
//TODO: The first student will implement this method.
	// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
	//Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.   
	
	
	Converter convert = new Converter();
	System.out.println(convert.celsiusToFahrenheit(180));
	System.out.println(convert.fahrenheitToCelsius(250));
  } 


}
