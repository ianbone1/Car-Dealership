package Car;

public class Engine implements IsComponent{

    private int bhp;
    private Transmission type;
    private Fuel fuel;

    public Engine(int bhp, Transmission transmissionType, Fuel fuel) {
        this.bhp = bhp;
        this.type = transmissionType;
        this.fuel= fuel;
    }

    public int getBhp() {
        return this.bhp;
    }

    public Transmission getType() {
        return this.type;
    }

    public Fuel getFuel() {
        return this.fuel;
    }
}
