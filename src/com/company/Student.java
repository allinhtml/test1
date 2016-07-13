package com.company;

class College {
    College() {
        System.out.println("Inside College");
    }
}


public class Student {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name) {

        this.name = name;
    }

    public static void main(String args[]) {
        Student s1 = new Student("nirali", 1);
        System.out.print(s1.toString());

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
