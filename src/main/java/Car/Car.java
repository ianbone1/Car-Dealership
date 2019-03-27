package Car;

import java.util.ArrayList;

public class Car {

    private ArrayList<IsComponent> components;
    private String colour;
    private double price;
    private double damage;


    public Car(String colour, double price) {
        this.colour = colour;
        this.price = price;
        components = new ArrayList<IsComponent>();
        damage = 0.0;
    }

    public void addComponent(IsComponent component){
        components.add(component);
    }

    public int componentCount(){
        return this.components.size();
    }

    public String getColour() {
        return this.colour;
    }

    public double getPrice() {
        return this.price;
    }

    public void addDamage(double damageCost){
        this.damage += damageCost;
        this.price -= damageCost;
    }

    public double getDamage() {
        return this.damage;
    }

    public void repairDamage(){
        this.price += this.damage;
        this.damage=0.0;
    }
}
