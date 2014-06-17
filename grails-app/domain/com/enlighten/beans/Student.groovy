package com.enlighten.beans

class Student {

    static constraints = {
    }
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String password;
    private Long phoneNo;
    private Byte[] image;
    private String qualification;

    private Set<Exam> examSet;
}
