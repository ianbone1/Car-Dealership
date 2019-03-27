package Car;

public class Wheel implements IsComponent{

    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}
