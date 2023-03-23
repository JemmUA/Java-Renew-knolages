package collections.entity;

public class Admin extends User{
    private String name;

    public Admin() {
    }

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                '}';
    }
}
