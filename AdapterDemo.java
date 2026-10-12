interface TemperatureConverter {
void convertTemperature(double celsius);
}

class FahrenheitConverter {
public void convertToFahrenheit(double celsius) {
double fahrenheit = (celsius * 9 / 5) + 32;
System.out.println("Temperature in Celsius    : " + celsius + " °C");
System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");
}
}

class TemperatureAdapter implements TemperatureConverter {

private FahrenheitConverter converter;

public TemperatureAdapter() {
converter = new FahrenheitConverter();
}

@Override
public void convertTemperature(double celsius) {
converter.convertToFahrenheit(celsius);
}
}

public class AdapterDemo {

public static void main(String[] args) {

TemperatureConverter converter =
new TemperatureAdapter();

converter.convertTemperature(25);
}
}
