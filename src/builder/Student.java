package builder;

public class Student {
    private String name;
    private  int age;
    private String uinvName;
    private String batchName;
    private String phone;

    private Student(Builder builder){
        if(builder.getAge()>100){
            throw new IllegalArgumentException("Wrong Age");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.uinvName = builder.getUinvName();
        this.batchName = builder.getBatchName();
        this.phone = builder.getPhone();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUinvName() {
        return uinvName;
    }

    public void setUinvName(String uinvName) {
        this.uinvName = uinvName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Builder class created here as INNER CLASS
    static class Builder{
        private String name;
        private  int age;
        private String uinvName;
        private String batchName;
        private String phone;

        public Student build(){
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUinvName() {
            return uinvName;
        }

        public Builder setUinvName(String uinvName) {
            this.uinvName = uinvName;
            return this;
        }

        public String getBatchName() {
            return batchName;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
    }

}
