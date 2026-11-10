import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private final List<TemperatureObserver> observers = new ArrayList<>();
    private double temperature;

    public void subscribe(TemperatureObserver o) {
        if (o == null) {
            throw new IllegalArgumentException("O observer não pode ser nulo");
        }
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    public void unsubscribe(TemperatureObserver o) {
        observers.remove(o);
    }

    public void setTemperature(double temp) {
        if (Double.isNaN(temp) || Double.isInfinite(temp)) {
            throw new IllegalArgumentException("Temperatura inválida: " + temp);
        }
        this.temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        List<TemperatureObserver> copia = new ArrayList<>(observers);
        for (TemperatureObserver o : copia) {
            o.onTemperatureChanged(temperature);
        }
    }
}
