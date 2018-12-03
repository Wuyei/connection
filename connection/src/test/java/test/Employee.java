package test;

import java.util.Date;

public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;
    private Student stu;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Date getHireDay() {
        return hireDay;
    }
    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }
    public Student getStu()  {
        return this.stu;
    }
    public void setStu(Student stu) {
        this.stu = stu;
    }
    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        e.stu = (Student) stu.clone(); 
        return e;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + ", stuName=" + stu.getName() + 
                ", stuAge"+stu.getAge()+"]";
    }
    
}
