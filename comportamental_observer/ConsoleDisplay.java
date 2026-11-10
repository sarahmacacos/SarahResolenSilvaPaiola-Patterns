public class ConsoleDisplay implements TemperatureObserver {
    @Override
    public void onTemperatureChanged(double temp) {
        System.out.println("Display: temperatura = " + temp);
    }
}
