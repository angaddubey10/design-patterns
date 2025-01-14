package builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Angad");
        builder.setAge(27);
        builder.setPhone("123456");
        builder.setBatchName("NIT JSR -2k19 Batch");

        Student student = new Student(builder);
        System.out.println(student.getName());
        System.out.println(student.getBatchName());
    }
}
