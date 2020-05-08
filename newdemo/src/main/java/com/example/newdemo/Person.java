package com.example.newdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class

public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Sno;

    private String FirstName;

    private String LastName;

    private String gender;

    private Integer age;

    private String email;

    public Integer getSno() { return Sno ; }

    public void setSno(Integer sno) { Sno = sno; }

    public String getFirstName() { return FirstName; }

    public void setFirstName(String firstName) { FirstName = firstName; }

    public String getLastName() { return LastName; }

    public void setLastName(String lastName) { LastName = lastName; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public Integer getAge() { return age; }

    public void setAge(String age) { this.age = age; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}
