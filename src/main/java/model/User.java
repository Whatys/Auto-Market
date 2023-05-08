package model;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Data
@Entity
@Table(name = "REGISTRATION_USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer userID;
    @Column(name = "username" , nullable = false)
    private String username;
    @Column(name = "first_name", nullable = false)
    private String fisrtName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email")
    private String email;

    @Column(name = "age", nullable = false)
    private Byte age;

    public User(){
    }

    public User(Integer userID, String fisrtName, String lastName, String email, Byte age) {
        this.userID = userID;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", fisrtName='" + fisrtName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}


