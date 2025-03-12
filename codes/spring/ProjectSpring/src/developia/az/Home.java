package developia.az;

@Component   
@Scope("prototype")
public class Home {
    private int id;
    private String address;
    private String color;

     public Home() {
        System.out.println("Home obyekt yaradıldı!");
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

     public void init() {
        System.out.println("Home obyektinin INIT metodu çağırıldı.");
    }

    public void destroy() {
        System.out.println("Home obyektinin DESTROY metodu çağırıldı.");
    }
}
