package pacuraru.fabian.lab8.ex4;

class TemperatureEvent extends Event {

    private int value;

    TemperatureEvent(int value) {
        super(EventType.FIRE.TEMPERATURE);
        this.value = value;
    }

    int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "TemperatureEvent{" + "value=" + value + '}';
    }

}
