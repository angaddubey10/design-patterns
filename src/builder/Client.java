package builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("abc");
        builder.setAge(12);
        builder.setPhone("1233456");

        Student student = new Student(builder);
        System.out.println(student.getAge());
        System.out.println(student.getName());
    }
}
