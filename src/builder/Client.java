package builder;

public class Client {
    public static void main(String[] args) {
        //Basic Builder Understanding
        /*
        BuilderOld builder = new BuilderOld();
        builder.setName("Angad");
        builder.setAge(27);
        builder.setPhone("123456");
        builder.setBatchName("NIT JSR -2k19 Batch");

        Student student = new Student(builder);
        System.out.println(student.getName());
        System.out.println(student.getBatchName());

        //Improving Builder
        BuilderOld builder1 =  Student.getBuilderOld();
        builder1.setName("Angad");
        builder1.setAge(27);
        builder1.setPhone("123456");
        builder1.setBatchName("NIT JSR -2k19 Batch");

        Student student1 = new Student(builder1);
        System.out.println("\nBuilder Improved Version");
        System.out.println(student1.getName());
        System.out.println(student1.getBatchName());
        */
        //More Improvement - Best Version
        Student student2 = Student.getBuilder()
                .setName("Angad")
                .setAge(27)
                .setPhone("123456")
                .setBatchName("NIT JSR -2k19 Batch")
                .build();
        System.out.println("\nBuilder Best Version");
        System.out.println(student2.getName());
        System.out.println(student2.getBatchName());
    }
}
