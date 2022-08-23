package com.sunglowsys.domain;

public class Student {
    private Long id;
    private String studentName;
    private String studentAddress;

    public Student(){

    }

    public Student(Long id, String studentName, String studentAddress) {
        this.id = id;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}


