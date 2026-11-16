import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {

    @Test
    void deveConverterCelsiusParaFahrenheit() {
        ConversorTemperatura conversor = new ConversorTemperatura();

        double resultado = conversor.celsiusParaFahrenheit(0);

        assertEquals(32.0, resultado, 0.001);
    }

    @Test
    void deveConverterFahrenheitParaCelsius() {
        ConversorTemperatura conversor = new ConversorTemperatura();

        double resultado = conversor.fahrenheitParaCelsius(212);

        assertEquals(100.0, resultado, 0.001);
    }
}
