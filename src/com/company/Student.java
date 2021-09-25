package com.company;

public class Student {
    private String name;
    private String college;

    public Student(String name, String college) {
        super();
        this.name =name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getCollege(){
        return college;
    }
    public void setCollege() {
        this.college = college;
    }

    public static void main(String[] args) {
        Student student = new Student("Sani", "BVB");
        Student student1 = new Student("M.RAY","SUES");
        Student student2 = new Student("King", "Harvard");
        System.out.println(student.name);
        System.out.println(student1.college);
    }
}
