package single.cherry.entity;

public class User {
    private int id;
    private String name;
    private String password;
    private String city;
    private String imageName;
    private double money;

    public User() {
    }

    public User(String name, String password, String city, String imageName, double money) {
        this.name = name;
        this.password = password;
        this.city = city;
        this.imageName = imageName;
        this.money = money;
    }

    public User(int id, String name, String password, String city, String imageName, double money) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.city = city;
        this.imageName = imageName;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
