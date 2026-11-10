public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        ConsoleDisplay display = new ConsoleDisplay();
        FanController fan = new FanController();

        station.subscribe(display);
        station.subscribe(fan);

        station.setTemperature(26);
        station.setTemperature(30);

        station.unsubscribe(display);
        station.setTemperature(27);
    }
}
