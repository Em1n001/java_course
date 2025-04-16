package developia.az.config;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private String brand;
    private double price;
    private String color;

     public Computer() {
        this.id = 1;
        this.brand = "Dell";
        this.price = 1200.50;
        this.color = "Black";
    }

     public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

     public void printComputerInfo() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
    }
}
