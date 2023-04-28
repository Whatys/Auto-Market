import model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/user-data";
        String user="root";
        String password="Automarket2023";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection is Succeseful");

            Statement statement = connection.createStatement();
            String selectTable = "SELECT * FROM `user-data`.users;";
            String insertUser = "INSERT INTO `user-data`.users (firstName, lastName,age, email)\n" +
                    "VALUES('Ianosh', 'Dobrovolschi', '2002-07-15', 'IanoshD@gmail.com');";
            System.out.println(statement.execute(selectTable));
            statement.execute(insertUser);

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }



//        User newUser = new User();
//        newUser.setEmail("granaci55@gmail.com");
//        System.out.println(newUser.getEmail());
    }
}