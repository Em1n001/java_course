package developia.az.config1;

import developia.az.Component;

@Component
public class Home {
    private String id;
    private String address;
    private String color;

    public Home() {
        this.id = "001";
        this.address = "Baku, Azerbaijan";
        this.color = "Blue";
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @PostConstruct
    public void init() {
        System.out.println("Home bean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Home bean is destroyed");
    }

    @Override
    public String toString() {
        return "Home{id='" + id + "', address='" + address + "', color='" + color + "'}";
    }
}
