package Models;

public class User {

    public int userID;
    public String fisrtName;
    public String lastName;
    public String email;
    public byte age;

    public User(){
        this.userID = 0;
        this.fisrtName = "first_name";
        this.lastName = "last_name";
        this.email = "example@mail.com";
        this.age = (byte)0;
    }

    public User(int userID, String fisrtName, String lastName, String email, byte age) {
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
}
