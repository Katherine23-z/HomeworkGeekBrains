package DataSystem;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void info(){
        System.out.println(this.age + " " + this.name);
    }
}
