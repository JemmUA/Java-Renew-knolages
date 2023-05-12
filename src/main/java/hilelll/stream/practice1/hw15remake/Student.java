package hilelll.stream.practice1.hw15remake;

public class Student {
    private String name;
    private Integer id;

    private static int idCounter = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Student(String name) {
        this.name = name;
        idCounter += 1;
        id = idCounter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
