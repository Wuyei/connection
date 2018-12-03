package test;

public class InitCode {
    private String name;
    private Integer age;
    {
        this.name = "w";
        this.age = 3;
    }
    
    public InitCode() {
//        this.name = "z";
//        this.age = 13;
    }
    {
//        this.name = "j";
//        this.age = 23;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "InitCode [name=" + name + ", age=" + age + "]";
    }
    
}
