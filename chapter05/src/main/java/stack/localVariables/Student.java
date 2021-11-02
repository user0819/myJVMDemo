package stack.localVariables;

import stack.localVariables.Person;

public class Student extends Person {
    private int age;

    public Student() {
    }

    public Student(int age) {
        String name = super.getName();
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
