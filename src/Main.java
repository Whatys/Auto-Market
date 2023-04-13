import Models.*;
public class Main {
    public static void main(String[] args) {
        User newUser = new User();
        newUser.setEmail("granaci55@gmail.com");
        System.out.println(newUser.getEmail());
    }
}