package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java14oct", "root", "Root@123");

            Scanner scanner=new Scanner(System.in);
            int id;
            String name;
            String address;
            System.out.println("enter id");
            id=scanner.nextInt();
            System.out.println("enter name");
            name=scanner.next();
            System.out.println("enter address");
            address=scanner.next();

            String insert = "insert into employee(id,name,address) values(?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(insert);

            preparedStatement.setInt(1,id);
            preparedStatement.setString(1,name);
            preparedStatement.setString(1,address);

            int i=preparedStatement.executeUpdate();
            System.out.println("record inserted=>"+i);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
