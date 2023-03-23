package collections.entity;

public class SuperAdmin extends Admin{

    private String name;

    public SuperAdmin() {
    }

    public SuperAdmin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SuperAdimin{" +
                "name='" + name + '\'' +
                '}';
    }
}
