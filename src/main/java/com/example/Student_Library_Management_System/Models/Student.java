package com.example.Student_Library_Management_System.Models;

//import net.bytebuddy.implementation.bind.MethodDelegationBinder;

//import javax.persistence.*;
import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private int age;
    @OneToOne(mappedBy = "studentVariableName", cascade = CascadeType.ALL)
    private Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    private String country;
    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
