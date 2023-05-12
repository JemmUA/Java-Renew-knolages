package hilelll.stream.practicre2.hwRe2;

public class Student {
    private String name;
    private Integer id;

    private static int studentsCounter = 0;

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
        studentsCounter += 1;
        id = studentsCounter;
    }

    public int getStudentsCounter(Student student) {
        System.out.println("Now we are "+studentsCounter+" in group");
        return studentsCounter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void sayHello(Student student) {
        System.out.println("Hello, i am " + student.getName() + ", my Id is: " + student.getId());
    }

    public static int studentsCount() {
        System.out.println("In our group " + studentsCounter + "students");
        return studentsCounter;
    }

    public void sayGoodbye() {
        System.out.println("bye )");
    }
}
